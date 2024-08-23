package Classes;

public class MetaDataCatalog {
    private String tableName;
    String[] ColumnName;
    String[] ColumnType;
    int[] index;
    String referencingColumn;
    String referencedColumn;
    String referencedTable;


    public MetaDataCatalog(String tableName, String[] columnName, String[] columnType, int[] index, String referencingColumn, String referencedColumn, String referencedTable) {
        this.tableName = tableName;
        ColumnName = columnName;
        ColumnType = columnType;
        this.index = index;
        this.referencingColumn = referencingColumn;
        this.referencedColumn = referencedColumn;
        this.referencedTable = referencedTable;
    }

    public String getTableName() {
        return tableName;
    }

    public String[] getColumnName() {
        return ColumnName;
    }

    public String[] getColumnType() {
        return ColumnType;
    }

    public int[] getIndex() {
        return index;
    }

    public String getReferencingColumn() {
        return referencingColumn;
    }

    public String getReferencedColumn() {
        return referencedColumn;
    }

    public String getReferencedTable() {
        return referencedTable;
    }
}

