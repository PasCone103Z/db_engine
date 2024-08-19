package Classes;

import java.util.Hashtable;

public class Table {
    String tableName;
    Hashtable<String, String> htblColNameValue;
    Page[] pages;
    String strClusteringKeyColumn;
    String strReferencedTable;
    String strReferencedColumn;
    String strReferencingColumn;

    public Table(String tableName, Hashtable<String, String> htblColNameValue, Page[] pages, String strClusteringKeyColumn, String strReferencedTable, String strReferencingColumn, String strReferencedColumn){

    }
}
