/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionequipe.vue;

import com.gestionequipe.controleur.ServiceILocal;
import com.gestionequipe.controleur.ServiceImpl;
import com.gestionequipe.metier.Membre;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author yblad
 */
public class frmAjouterMembre extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmAjouterMembre
     */
    
	public ServiceILocal se = new ServiceImpl();
	public Membre membre=new Membre();
	   List<Membre> listmembre;
    public frmAjouterMembre() {
        initComponents();
    }
public void ListerMembre()
	{	
		
 	
		listmembre=se.GetAllMembre();
		          DefaultTableModel model= (DefaultTableModel) tbMembre.getModel();
		 
		 Object[]data=new Object[6] ;
		 for(int i=0;i<listmembre.size();i++) 
		 {
			 data[0]=listmembre.get(i).getMembreId();
			 data[1]=listmembre.get(i).getMembreNom();
			 data[2]=listmembre.get(i).getMembrePrenom();
			 data[3]=listmembre.get(i).getMembreAdress();
			 data[4]=listmembre.get(i).getMembreTel();
			 data[5]=listmembre.get(i).getMembreEmail(); 
			 model.addRow(data);
			 //System.out.println(data);
		 }
        }
public void ClearTextField() 
	{ 
			// TODO Auto-generated method stub
			txtId.setText(null);
			txtNom.setText(null);
			txtPrenom.setText(null);
			txtAdress.setText(null);
			txtTel.setText(null);
			txtEmail.setText(null);
		 
		
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMembre = new javax.swing.JTable();
        btnRechercher = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("ID:");

        txtId.setText(" ");
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNom.setText(" ");
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom:");

        jLabel3.setText("Prenom:");

        txtPrenom.setText(" ");
        txtPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrenomActionPerformed(evt);
            }
        });

        jLabel4.setText("Adresse:");

        txtAdress.setText(" ");

        jLabel5.setText("Phone:");

        txtTel.setText(" ");

        jLabel6.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        tbMembre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOM", "PRENOM", "ADRESSE", "PHONE", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMembre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMembreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMembre);

        btnRechercher.setText("RECHERCHER");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });

        btnAjouter.setText("AJOUTER");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setText("SUPPRIMER");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnModifier.setText("MODIFIER");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnAjouter)
                .addGap(119, 119, 119)
                .addComponent(btnRechercher)
                .addGap(122, 122, 122)
                .addComponent(btnModifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSupprimer)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRechercher)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer)
                    .addComponent(btnAjouter))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
   
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrenomActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void tbMembreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMembreMouseClicked
        // TODO add your handling code here:
        		        int index =tbMembre.getSelectedRow();
				TableModel model=tbMembre.getModel();
				txtId.setText(model.getValueAt(index, 0).toString());
				txtNom.setText(model.getValueAt(index, 1).toString());
				txtPrenom.setText(model.getValueAt(index, 2).toString());
				txtAdress.setText(model.getValueAt(index, 3).toString());
				txtTel.setText(model.getValueAt(index, 4).toString());
				txtEmail.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_tbMembreMouseClicked
public void refresh()
{  listmembre=se.GetAllMembre();
		          DefaultTableModel model= (DefaultTableModel) tbMembre.getModel();
		  model.setRowCount(0);
		 Object[]data=new Object[6] ;
		 for(int i=0;i<listmembre.size();i++) 
		 {
			 data[0]=listmembre.get(i).getMembreId();
			 data[1]=listmembre.get(i).getMembreNom();
			 data[2]=listmembre.get(i).getMembrePrenom();
			 data[3]=listmembre.get(i).getMembreAdress();
			 data[4]=listmembre.get(i).getMembreTel();
			 data[5]=listmembre.get(i).getMembreEmail(); 
			 model.addRow(data);
			 //System.out.println(data);
		 }
     
                        
                         
}
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
        membre.setMembreId(new Integer(txtId.getText()));
				membre.setMembreNom(txtNom.getText());
				membre.setMembrePrenom(txtPrenom.getText());
				membre.setMembreAdress(txtAdress.getText());
				membre.setMembreTel(txtTel.getText());
				membre.setMembreEmail(txtEmail.getText());
				String rep=	se.AddMembre(membre);	
				if(rep=="valider")
				{
					 
				    JOptionPane.showMessageDialog(frmAjouterMembre.this, "Membre enregistre", "Information Message", 1);
                                    refresh();
                                    ClearTextField();
				}
				else
				{
					JOptionPane.showMessageDialog(frmAjouterMembre.this, "Enregistrement echoue", "Information Message", 1);
					
				}
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        // TODO add your handling code here:
        Membre memb=se.FindOneMembre(new Integer(txtId.getText()));
				
			     
				txtNom.setText(memb.getMembreNom());
				txtPrenom.setText(memb.getMembrePrenom());
				txtAdress.setText(memb.getMembreAdress());
				txtTel.setText(memb.getMembreTel());
				txtEmail.setText(memb.getMembreEmail());
    }//GEN-LAST:event_btnRechercherActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        membre.setMembreId(new Integer(txtId.getText()));
				membre.setMembreNom(txtNom.getText());
				membre.setMembrePrenom(txtPrenom.getText());
				membre.setMembreAdress(txtAdress.getText());
				membre.setMembreTel(txtTel.getText());
				membre.setMembreEmail(txtEmail.getText());
			String rep=	se.UpdateMembre(membre);	
			if(rep=="valider")
			{
			   JOptionPane.showMessageDialog(frmAjouterMembre.this, "Membre Modifie", "Information Message", 1);
			refresh();	
                           ClearTextField();
			}
			else
			{
				JOptionPane.showMessageDialog(frmAjouterMembre.this, "Modification echoue", "Information Message", 1);
				
			}
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
         	String rep=	se.DeleteMembre(new Integer(txtId.getText()));
				if(rep=="valider")
				{
					JOptionPane.showMessageDialog(frmAjouterMembre.this, "Membre supprime", "Information Message", 1);
					refresh();
                                        ClearTextField();
				}
				else
				{
					JOptionPane.showMessageDialog(frmAjouterMembre.this, "Supression echoue", "Information Message", 1);
					
				}
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        ListerMembre();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMembre;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}