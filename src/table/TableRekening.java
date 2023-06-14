package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Rekening;

public class TableRekening extends AbstractTableModel {
    private List<Rekening> list;

    public TableRekening(List<Rekening> list) {
        this.list = list;
    }
    
    public List<Rekening> getList() {
        return list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Rekening rekening = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rekening.getNoRekening();
            case 1:
                return rekening.getJenis();
            case 2:
                return rekening.getSaldo();
            case 3:
                return rekening.getNasabah().getCustomer_identification();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No Rekening";
            case 1:
                return "Jenis";
            case 2:
                return "Saldo";
            case 3:
                return "Customer Identification";
            default:
                return null;
        }
    }
}
