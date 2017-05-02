package inf2120_tp3;
/**
 *
 * @author janindancause
 */
public class Activitees implements Comparable< Activitees >{
private static int nb=0;
private int id;
private String Titre;
private String Description;
private String Heure;
private int hour;
private int minute;

    /**
     *constructeur 
     * @param titre de l'activitée 
     * @param description
     * @param heure
     * @param hour      sert au calcul des secondes pour l'ordre
     * @param minute    est utiliser dans le calcul
     */
    public Activitees(String titre,String description, String heure, int hour,int minute){
        this.nb=nb+1;
        this.id=nb;
        this.Titre=titre;
        this.Description=description;
        this.Heure=heure;
        this.hour=hour;
        this.minute=minute;
    }
public Activitees(){}

    public String getTitre() {
        return Titre;
    }

    public String getDescription() {
        return Description;
    }

    public String getHeure() {
        return Heure;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setHeure(String Heure) {
        this.Heure = Heure;
    }
    public int getId(){
    return id;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     *méthode qui sert mettre les activités à jour
     * @param titre
     * @param description
     * @param heure
     * @param hour
     * @param minute
     */
    public void update(String titre,String description, String heure, int hour,int minute){
       setTitre(titre);
       setDescription(description);
       setHeure(heure);
       setHour(hour);
       setMinute(minute);
    }

    /**
     *sert a calculer les secondes pour mettre en ordre les activités
     * 
     * @return
     */
    public int getSeconde(){
        return(hour*60*60)+(minute*60);
    }

    @Override
    public String toString() {
        return "Activitees{" + "id=" + id + ", Titre=" + Titre + ", Description=" + Description + ", Heure=" + Heure + ", second="+getSeconde()+'}';
    }

    @Override
    public int compareTo(Activitees AutreActivitees) {
        return getSeconde()-AutreActivitees.getSeconde();   
    }

}
