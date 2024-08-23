package Classes;

import java.util.Hashtable;

public class Table {
    String tableName;
    MetaDataCatalog metadata;
    Hashtable<String, String> htblColNameType;
    Page[] pages;
    String strClusteringKeyColumn;
    String strReferencedTable;
    String strReferencedColumn;
    String strReferencingColumn;

    public Table(String tableName, MetaDataCatalog metadata, Hashtable<String, String> htblColNameType, Page[] pages, String strClusteringKeyColumn, String strReferencedTable, String strReferencedColumn, String strReferencingColumn) {
        this.tableName = tableName;
        this.metadata = metadata;
        this.htblColNameType = htblColNameType;
        this.pages = pages;
        this.strClusteringKeyColumn = strClusteringKeyColumn;
        this.strReferencedTable = strReferencedTable;
        this.strReferencedColumn = strReferencedColumn;
        this.strReferencingColumn = strReferencingColumn;
    }
}
