
package inf2120_tp3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * @author janindancause
 */
public class Agenda extends JFrame implements ActionListener{
    ArrayList listAct=new ArrayList();
    JButton ajouter;
    JButton supprimer;
    JButton modifier;
    JButton enrigistrer;
  
    JButton test;
    JButton button[];  
    
    JLabel      titre;
    JLabel      description;
    JLabel      heure;
    JLabel      listesActivitees;
    
    JTextField  id=new JTextField();
    JTextField  txtTitre;
    JTextArea   txtDescription;
    JTextField  txtHeure;
    
    JScrollPane spText;
    
    JPanel      nord;
    JPanel      est;
    JPanel      centre;
    JPanel      nordFlow;
    JPanel      FlowNordCentre;
    JPanel      FlowSudCentre;
    
    /**
     *contructeur de la fenetre agenda
     * paramétrise la femetre lors de son initialisation
     * elle applique les layouts de bases
     */
    public Agenda(){
       setTitle("Agenda");
       setDefaultCloseOperation(EXIT_ON_CLOSE );
       setLayout(new BorderLayout());
        
       add(nordLayout(),BorderLayout.NORTH);
       add(Centre(),BorderLayout.CENTER);
       
       
       est=new JPanel(new GridLayout(11,1));
       estLayout();
       add(est,BorderLayout.WEST);
       id.setVisible(false);
       add(id,BorderLayout.EAST);
       
       centre.setVisible(false);
       supprimer.setVisible(false);
      
       pack();
       setVisible(true);
       setSize(700, 350);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource()==ajouter){
                    fondBoiteTextReset();
                    toEmpty();
                    modifier.setVisible(false);
                    supprimer.setVisible(false);
                    enrigistrer.setVisible(true);
                    centre.setVisible(true);
       }
       if(e.getSource()==supprimer){
           if(JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir effacer cet enrigistrement?", "Avertissement",JOptionPane.YES_OPTION)==0){
                    supprimer(id.getText());
                    miseaJourButton();
                    centre.setVisible(false);
                    modifier.setVisible(false);
                    supprimer.setVisible(false);
                    enrigistrer.setVisible(false); 
                    JOptionPane.showConfirmDialog(null,"L'activitée a bien été supprimé","Avertissement",JOptionPane.DEFAULT_OPTION);
                    toEmpty();
           }else{
           JOptionPane.showConfirmDialog(null, "L'activité n'a pas été supprimer", "Avertissement", JOptionPane.DEFAULT_OPTION);
           }
       }
       
       if(e.getSource()==enrigistrer){
            if(valider()==true){
                if(JOptionPane.showConfirmDialog(null, "Voulez-vous sauvegarder cette activitée", "Enrigistrement", JOptionPane.YES_OPTION)==0){
                    Enrigistrer();  
                    centre.setVisible(false);
                    supprimer.setVisible(false);
                    miseaJourButton();
                    JOptionPane.showConfirmDialog(null,"L'acitivitée a bien été sauvegardé","Avertissement",JOptionPane.DEFAULT_OPTION);
                    toEmpty();
                }else{
                    JOptionPane.showConfirmDialog(null,"L'activitée n'a pas été sauvegardé","Avertissement",JOptionPane.DEFAULT_OPTION);
                } 
            }
       }
       if(e.getSource()==modifier){
           if(valider()==true){
                if(JOptionPane.showConfirmDialog(null, "Voulez-vous modifier cette activitée", "Modification", JOptionPane.YES_OPTION)==0){
                    modifierActiviter(id.getText());
                    miseaJourButton();
                    centre.setVisible(false);
                    supprimer.setVisible(false);  
                    JOptionPane.showConfirmDialog(null,"L'acitivitée a bien été modifié","Avertissement",JOptionPane.DEFAULT_OPTION);
                    toEmpty(); 
                }else{
                    JOptionPane.showConfirmDialog(null,"L'activitée n'a pas été modifié","Avertissement",JOptionPane.DEFAULT_OPTION);
                }      
            }    
        }
       try{
       for (int i = 0; i < button.length; ++i) {
            if (e.getSource()==button[i]){
                afficherModifier(Iterator(button[i].getActionCommand()));
                centre.setVisible(true);
                modifier.setVisible(true);
                supprimer.setVisible(true);
                enrigistrer.setVisible(false);
            }
        }
       }catch(NullPointerException ex){}
    }
     
    /**
     *Méthode qui construit la fenêtre qui sert a entrer les activitées
     * @return
     */
    public JPanel Centre(){
       
        modifier=new JButton("Modifier");
        enrigistrer=new JButton("Enrigistrer");
        modifier.addActionListener(this);
        enrigistrer.addActionListener(this);

        titre=new JLabel("Titre");
        description=new JLabel("Description");
        heure=new JLabel("Heure");

        txtTitre=new JTextField();
        txtHeure=new JTextField();
        txtDescription=new JTextArea();
        spText= new JScrollPane(txtDescription);
      
     
        FlowNordCentre =new JPanel(new GridLayout(3,2));
        FlowSudCentre=new JPanel(new GridLayout(0,2));  
        centre=new JPanel(new BorderLayout());

        FlowNordCentre.add(titre);
        FlowNordCentre.add(txtTitre);
        FlowNordCentre.add(heure);
        FlowNordCentre.add(txtHeure);
        FlowNordCentre.add(description);
        
       
        centre.add(FlowNordCentre,BorderLayout.NORTH);
        centre.add(spText,BorderLayout.CENTER);

        FlowSudCentre.add(modifier);
        FlowSudCentre.add(enrigistrer);
               
        centre.add(FlowSudCentre,BorderLayout.SOUTH);

    return centre;  
   }
   
    /**
     *initialise le layout nord  qui contient les boutons ajouter et supprimer
     * @return
     */
    public JPanel nordLayout(){  
        nordFlow=new JPanel(new FlowLayout(5));
        ajouter=new JButton("Ajouter");    
        supprimer=new JButton("Supprimer");
        ajouter.addActionListener(this);
        supprimer.addActionListener(this);
        nordFlow.add(ajouter);
        nordFlow.add(supprimer);
     return nordFlow;
    }

    /**
     *initialise le layout qui va afficher les boutons
     */
    public void estLayout(){
        listesActivitees=new JLabel("   listes des activitées     ");
        est.add(listesActivitees);
    }

    /**
     *La méthode valide si les champs sont sont bien remplit
     * si ce n'est pas le cas un message d'erreur s'affiche
     * @return
     */
    public boolean valider(){
        String Message="";
        boolean valide=true;
        fondBoiteTextReset();
        if(txtTitre.getText().isEmpty()){
               Message="Le titre est vide\n";
               txtTitre.setBackground(Color.red);
               valide=false;
        }
        if(txtDescription.getText().isEmpty()){
               Message=Message+"Vous n'avez pas entré de description\n";
               txtDescription.setBackground(Color.red);
               valide=false;
        }
        if(txtHeure.getText().isEmpty()){
               Message=Message+"L'heure est vide";
               txtHeure.setBackground(Color.red);
               valide=false;
           }else if(!validerHeure(txtHeure.getText())){
               Message=Message+"L'heure est invalide HH:MM\n";
               txtHeure.setBackground(Color.red);             
               valide=false;
        }
        if(valide==false){          
               showMessageDialog(null, Message, "Erreur", JOptionPane.WARNING_MESSAGE);    
        }

    return valide;
    }
    
    /**
     *remet les boites texte à vide pour entré une nouvelle activitée
     */
    public void toEmpty(){
           txtTitre.setText("");
           txtDescription.setText("");
           txtHeure.setText(""); 
           id.setText("");
   }
    
    /**
     *ajoute une activité dans la liste des activitées
     */
    public void Enrigistrer(){
       String[] result = txtHeure.getText().split(":");
       listAct.add(new Activitees(txtTitre.getText(),txtDescription.getText(),txtHeure.getText(),Integer.parseInt(result[0]),Integer.parseInt(result[1])));
   }

    /**
     *Affiche dans les textes box l'Activitée qui a été demandé de modifier
     * @param activ
     */
    public void afficherModifier(Activitees activ){
    id.setText(Integer.toString(activ.getId()));
    txtTitre.setText(activ.getTitre());
    txtDescription.setText(activ.getDescription());
    txtHeure.setText(activ.getHeure());
   }

    /**
     *
     * @param heure reçoit la string d'heure de la boite txtHeure
     * @return retourn un boolean si la validité de la string
     */
    public boolean validerHeure(String heure){
   boolean valide=false;
   if(heure.contains(":")&& (heure.length()>=4 && heure.length()<=5)){
       valide=true;
       try{
           String[] result = heure.split(":");
           if(Integer.parseInt(result[0])<0 || Integer.parseInt(result[0])>23){
               valide=false;
               
           } if((Integer.parseInt(result[1])<0 || Integer.parseInt(result[1])>59)&& result[1].length()<2 ){
               valide=false;
           }
       }catch (NumberFormatException e){
           valide=false;
       }
   }
   return valide;
   }

    /**
     *Vide le layout des buttons et le reconstruit
     */
    public void nettoyerLayoutButton(){
        est.removeAll(); 
        estLayout();
        triActivitees();
        button=null;
    }
    
    /**
     *Mise à jour de button
     * la liste des activitées a été mise à jour
     * creer un nouveau tableau de button
     * s'assure de ne creer qu'un maximum de 10 buttons
     */
    public void miseaJourButton(){
    nettoyerLayoutButton();
    button=new JButton[listAct.size()];
     Iterator<Activitees> itActivitees   =  listAct.iterator(); 
     Activitees temp=null;
     int i =0;
      int Max;
     if(listAct.size()>10){
     Max=10;
     }else{
     Max=listAct.size();
     }
    String tempTitre="";
     for(int j =0; j<Max;++j ){
       temp= itActivitees.next();
       if(temp.getTitre().length()>10){
         tempTitre=(temp.getTitre().substring(0,10)+"...");  
       }else{
          tempTitre=temp.getTitre();  
       }
            button[j]=new JButton(tempTitre+" "+temp.getHeure());
            button[j].addActionListener(this);
            button[j].setActionCommand(Integer.toString(temp.getId()));
            est.add(button[j]);
     }
    }

    /**
     *efface l'id envoyer par iterateur
     * @param id
     */
    public void supprimer(String id){  
        listAct.remove(Iterator(id));
    }

    /**
     * modifie l'activitée envoyé par l'itérateur avec l'id
     * @param id
     */
    public void modifierActiviter(String id){
        Activitees trouver=Iterator(id);   
        String[] result = txtHeure.getText().split(":");
        trouver.update(txtTitre.getText(), txtDescription.getText(), txtHeure.getText(), Integer.parseInt(result[0]), Integer.parseInt(result[1]));
    }

    /**
     *
     * @param id de l'enrigistrement a rechercher dans la liste
     * @return retourn l'Activitée qui correspond à l'id
     */
    public Activitees Iterator(String id){
    Iterator itList=listAct.iterator();
        Object act=null;
        Activitees temp=null;
        Activitees trouver=null;
        while(itList.hasNext()){
            act=itList.next();
         if(act instanceof Activitees){
             temp=(Activitees) act;
             if(Integer.toString(temp.getId()).equals(id)){
               trouver=temp;
            }
         }
        } 
    return trouver;
    }

    /**
     *met en ordre la liste en fonction de l'heure(nombres de seconde)
     *tri par insertion
     */
    public void triActivitees(){
        if (listAct.size()>1){
            Activitees tab[]= (Activitees[]) listAct.toArray(new Activitees[listAct.size()]);  

            for(int i=1;i<tab.length;++i){
                int j=i;
                Activitees X=tab[j];
                while(j!=0 && tab[j-1].compareTo(X)>0){
                    tab[j] = tab[j-1];
                    --j;
                    }
                tab[j]=X;
            }
            listAct=new ArrayList(Arrays.asList(tab));
        }    
    }

    /**
     *réinitialise les boites texte à blanc
     */
    public void fondBoiteTextReset(){
    txtTitre.setBackground(Color.WHITE);
    txtDescription.setBackground(Color.WHITE);
    txtHeure.setBackground(Color.WHITE);
    }
}
