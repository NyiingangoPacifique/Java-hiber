package Reportview;
// Generated May 12, 2020 3:27:44 PM by Hibernate Tools 4.3.1



/**
 * Boocategory generated by hbm2java
 */
public class Boocategory  implements java.io.Serializable {


     private int categoryid;
     private String catename;

    public Boocategory() {
    }

	
    public Boocategory(int categoryid) {
        this.categoryid = categoryid;
    }
    public Boocategory(int categoryid, String catename) {
       this.categoryid = categoryid;
       this.catename = catename;
    }
   
    public int getCategoryid() {
        return this.categoryid;
    }
    
    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }
    public String getCatename() {
        return this.catename;
    }
    
    public void setCatename(String catename) {
        this.catename = catename;
    }




}


