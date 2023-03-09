package leoaldamas.dev.storemanagementsystem.db;

public enum Query {

    /* login */
    LOGIN_STORE_USER("""
            SELECT  stu.id_user, stu.name FROM store_user stu
            WHERE stu.username = ? AND stu.password = ?
            """),
    LOGIN_ADMINISTRATOR_USER("""
            SELECT adu.id_user, adu.name
            FROM administrator_user adu
            WHERE adu.username = ? AND adu.password = ?                        
            """),
    LOGIN_SUPERVISOR_USER("""
            SELECT sup.id_user, sup.name FROM supervisor_user sup
            WHERE sup.username = ? AND sup.password = ?
            """),
    LOGIN_WAREHOUSE_USER("""
            SELECT whu.id_user, whu.name FROM warehouse_user whu
            WHERE whu.username = ? AND whu.password = ?                     
            """),
    /* store user */;

    private String query;

    private Query(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
