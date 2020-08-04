/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMonHoc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ControllerQLMH {
    private ModelQLMH model;
    private FrameQLMH view;
    
    public ControllerQLMH(ModelQLMH model, FrameQLMH view){
        this.model = model;
        this.view = view;
        init();
        this.view.setVisible(true);
    }
    
    public void init(){
        view.getBtnThem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ma = view.getTxtMaMonHoc().getText();
                String ten = view.getTxtTenMonHoc().getText();
                int tinChi = Integer.parseInt(view.getTxtSoTinChi().getText());
                MonHoc mh = new MonHoc(ma, ten, tinChi);
                model.addMonHoc(mh);
                showTableMonHoc(model.getDsMonHoc());
            }
        });
    }
    
    public void showTableMonHoc(ArrayList<MonHoc> dsMonHoc){
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbQuanLyMonHoc().getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Ma mon hoc");
        tableModel.addColumn("Ten mon hoc");
        tableModel.addColumn("So tin chi");
        
        for (MonHoc monHoc : dsMonHoc) {
            tableModel.addRow(new Object[]{monHoc.getMaMonHoc(), monHoc.getTenMonHoc(), monHoc.getTinChi()});
        }
        view.getTbQuanLyMonHoc().setModel(tableModel);
    }
    public static void main(String[] args) {
        new ControllerQLMH(new ModelQLMH(), new FrameQLMH());
    }
}
