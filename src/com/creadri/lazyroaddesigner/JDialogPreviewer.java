/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogPreviewer.java
 *
 * Created on Sep 16, 2011, 12:58:35 PM
 */
package com.creadri.lazyroaddesigner;

import com.creadri.lazyroad.Road;

/**
 *
 * @author adri
 */
public class JDialogPreviewer extends javax.swing.JDialog {
    
    /** Creates new form JDialogPreviewer */
    public JDialogPreviewer(java.awt.Frame parent, boolean modal, MaterialArray isometrics) {
        super(parent, modal);
        
        initComponents();
        
        jPreview.setIsometrics(isometrics);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jlRoadPreviewZoom = new javax.swing.JLabel();
        jsRoadPreviewZoom = new javax.swing.JSlider();
        jbRoadPreviewZoom = new javax.swing.JButton();
        jPreview = new com.creadri.lazyroaddesigner.JIsometricPreview();

        setTitle("Isometric Previewer");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jlRoadPreviewZoom.setText("Zoom:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jlRoadPreviewZoom, gridBagConstraints);

        jsRoadPreviewZoom.setMajorTickSpacing(10);
        jsRoadPreviewZoom.setMaximum(50);
        jsRoadPreviewZoom.setMinimum(10);
        jsRoadPreviewZoom.setMinorTickSpacing(5);
        jsRoadPreviewZoom.setPaintTicks(true);
        jsRoadPreviewZoom.setValue(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jsRoadPreviewZoom, gridBagConstraints);

        jbRoadPreviewZoom.setText("Change Zoom");
        jbRoadPreviewZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRoadPreviewZoomActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jbRoadPreviewZoom, gridBagConstraints);

        javax.swing.GroupLayout jPreviewLayout = new javax.swing.GroupLayout(jPreview);
        jPreview.setLayout(jPreviewLayout);
        jPreviewLayout.setHorizontalGroup(
            jPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        jPreviewLayout.setVerticalGroup(
            jPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPreview, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setRoad(Road road) {
        jPreview.setRoad(road);
        //jPreview.paint(jPreview.getGraphics());
    }
    
    private void jbRoadPreviewZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRoadPreviewZoomActionPerformed
        
        jPreview.setZoom((float)jsRoadPreviewZoom.getValue() / 10);
        jPreview.updateUI();
        
    }//GEN-LAST:event_jbRoadPreviewZoomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.creadri.lazyroaddesigner.JIsometricPreview jPreview;
    private javax.swing.JButton jbRoadPreviewZoom;
    private javax.swing.JLabel jlRoadPreviewZoom;
    private javax.swing.JSlider jsRoadPreviewZoom;
    // End of variables declaration//GEN-END:variables
}