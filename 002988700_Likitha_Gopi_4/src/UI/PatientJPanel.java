/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.House;
import model.PatientDirectory;
import model.Person;
import model.Encounter;
import model.Patient;
import model.PersonDirectory;
import model.EncounterHistory;
import model.VitalSigns;

/**
 *
 * @author Likitha G
 */
public class PatientJPanel extends javax.swing.JPanel {

    PatientDirectory patientDirectory;
//    private PersonDirectory personDirectory;
    private PersonDirectory personDirectory;
    Object selectedPerson;
     PatientDirectory pd;
    HashMap<String, Patient> map = pd.map;
    /**
     * Creates new form PatientJPanel
     *
     */
    public PatientJPanel(PersonDirectory personDirectory) {
        
        
        initComponents();
        this.personDirectory = personDirectory;
        ArrayList<Person> personList = personDirectory.getPersonDirectory();
        populatePatientsTable(personList);
        
         setDefaultOptions1();
        revalidate();
            repaint();
    }

    private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) tblPerson1.getModel();
        if (personList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            model.setRowCount(0);
            
            for (Person person : personList) {
                
            System.out.println("Person value: "+person);
                Object[] row = new Object[10];
                row[0] = person;
                row[1] = person.getAge();
                if (person.getPatient() != null) {
                    row[2] = person.getPatient().getPid();
                } else {
                    row[2] = "Not a Patient";
                }
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson1 = new javax.swing.JTable();
        lblPatient = new javax.swing.JLabel();
        btnCreatePatient = new javax.swing.JButton();
        btnAddVitals = new javax.swing.JButton();
        btnViewVitals = new javax.swing.JButton();
        paneCreatePatient = new javax.swing.JPanel();
        lblCreatePatient = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblPurpose = new javax.swing.JLabel();
        btnAddPatient = new javax.swing.JButton();
        txtPatientID = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JTextField();
        paneAddVitals = new javax.swing.JPanel();
        lblCreatePatient1 = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        lblBp = new javax.swing.JLabel();
        lblRespiratory = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtHeart = new javax.swing.JTextField();
        txtBp = new javax.swing.JTextField();
        txtRespiratory = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        btnAddVitals1 = new javax.swing.JButton();
        paneViewVitals = new javax.swing.JPanel();
        lblCreatePatient2 = new javax.swing.JLabel();
        lblHeartRate1 = new javax.swing.JLabel();
        lblBp1 = new javax.swing.JLabel();
        lblRespiratory1 = new javax.swing.JLabel();
        lblWeight1 = new javax.swing.JLabel();
        txtHeart1 = new javax.swing.JTextField();
        txtBp1 = new javax.swing.JTextField();
        txtRespiratory1 = new javax.swing.JTextField();
        txtWeight1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setToolTipText("");

        tblPerson1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Age", "PatientID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson1);

        lblPatient.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatient.setText("Manage Patient Details:");

        btnCreatePatient.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnAddVitals.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAddVitals.setText("Add Vitals to existing patient ");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });

        btnViewVitals.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnViewVitals.setText("View Vitals of a Patient");
        btnViewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalsActionPerformed(evt);
            }
        });

        paneCreatePatient.setBackground(new java.awt.Color(153, 153, 153));

        lblCreatePatient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCreatePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePatient.setText("Create Patient:");

        lblPatientId.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPatientId.setText("Patient ID");

        lblDoctor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDoctor.setText("Doctor Name");

        lblPurpose.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurpose.setText("Purpose of Visit");

        btnAddPatient.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnAddPatient.setText("Add");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        txtDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorActionPerformed(evt);
            }
        });

        txtPurpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurposeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneCreatePatientLayout = new javax.swing.GroupLayout(paneCreatePatient);
        paneCreatePatient.setLayout(paneCreatePatientLayout);
        paneCreatePatientLayout.setHorizontalGroup(
            paneCreatePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreatePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCreatePatientLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(paneCreatePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPurpose)
                    .addComponent(lblDoctor))
                .addGap(33, 33, 33)
                .addGroup(paneCreatePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtDoctor)
                    .addComponent(txtPurpose))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCreatePatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddPatient)
                .addGap(103, 103, 103))
        );
        paneCreatePatientLayout.setVerticalGroup(
            paneCreatePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCreatePatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(paneCreatePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(paneCreatePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctor)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(paneCreatePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurpose)
                    .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddPatient)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        paneAddVitals.setBackground(new java.awt.Color(153, 153, 153));

        lblCreatePatient1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCreatePatient1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePatient1.setText("Add Vital Details:");

        lblHeartRate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblHeartRate.setText("Heart Rate");

        lblBp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBp.setText("Blood Pressure");

        lblRespiratory.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRespiratory.setText("Respiratory Rate");

        lblWeight.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblWeight.setText("Weight(in Pounds)");

        txtBp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBpActionPerformed(evt);
            }
        });

        txtRespiratory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespiratoryActionPerformed(evt);
            }
        });

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        btnAddVitals1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnAddVitals1.setText("Add");
        btnAddVitals1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitals1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneAddVitalsLayout = new javax.swing.GroupLayout(paneAddVitals);
        paneAddVitals.setLayout(paneAddVitalsLayout);
        paneAddVitalsLayout.setHorizontalGroup(
            paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreatePatient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneAddVitalsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBp)
                    .addComponent(lblRespiratory)
                    .addComponent(lblWeight))
                .addGap(58, 58, 58)
                .addGroup(paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHeart)
                    .addComponent(txtBp)
                    .addComponent(txtRespiratory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtWeight)
                    .addGroup(paneAddVitalsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAddVitals1)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        paneAddVitalsLayout.setVerticalGroup(
            paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAddVitalsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreatePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBp)
                    .addComponent(txtBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespiratory)
                    .addComponent(txtRespiratory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(paneAddVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddVitals1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        paneViewVitals.setBackground(new java.awt.Color(153, 153, 153));

        lblCreatePatient2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCreatePatient2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePatient2.setText("View Vital Details:");

        lblHeartRate1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblHeartRate1.setText("Heart Rate");

        lblBp1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBp1.setText("Blood Pressure");

        lblRespiratory1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRespiratory1.setText("Respiratory Rate");

        lblWeight1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblWeight1.setText("Weight(in Pounds)");

        txtBp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBp1ActionPerformed(evt);
            }
        });

        txtRespiratory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespiratory1ActionPerformed(evt);
            }
        });

        txtWeight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeight1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneViewVitalsLayout = new javax.swing.GroupLayout(paneViewVitals);
        paneViewVitals.setLayout(paneViewVitalsLayout);
        paneViewVitalsLayout.setHorizontalGroup(
            paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreatePatient2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneViewVitalsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeartRate1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBp1)
                    .addComponent(lblRespiratory1)
                    .addComponent(lblWeight1))
                .addGap(58, 58, 58)
                .addGroup(paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHeart1)
                    .addComponent(txtBp1)
                    .addComponent(txtRespiratory1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtWeight1))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        paneViewVitalsLayout.setVerticalGroup(
            paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneViewVitalsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreatePatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBp1)
                    .addComponent(txtBp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespiratory1)
                    .addComponent(txtRespiratory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(paneViewVitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight1)
                    .addComponent(txtWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnCreatePatient)
                            .addGap(28, 28, 28)
                            .addComponent(btnAddVitals)
                            .addGap(26, 26, 26)
                            .addComponent(btnViewVitals)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneViewVitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneAddVitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreatePatient)
                    .addComponent(btnAddVitals)
                    .addComponent(btnViewVitals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(paneAddVitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paneViewVitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(paneCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed

        int selectedRow= tblPerson1.getSelectedRow();
        Person person=(Person) tblPerson1.getValueAt(selectedRow, 0);
        
        if(person.getPatient()!=null)
        {
            JOptionPane.showMessageDialog(this, "Paient already exists.","Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        createPatient(person);

        

    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void createPatient(Person temp){
        Person person = temp;
        Patient patient = new Patient();
        Encounter encounter = new Encounter();
        EncounterHistory encounterHistory = new EncounterHistory();
             if (txtDoctor.getText().isEmpty() || txtPurpose.getText().isEmpty() || txtPatientID.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Enter All Details");
        }
             else{
        encounter.setDoctorName(txtDoctor.getText());
        encounter.setVisitedDate(new Date());
        encounter.setPurposeOfVist(txtPurpose.getText());
        ArrayList<Encounter> al = new ArrayList();
        al.add(encounter);
        encounterHistory.setList(al);
        patient.setEncounterHistory(encounterHistory);

        patient.setPid(txtPatientID.getText());
     
        
        //Adding Patient to Person
         person.setPatient(patient);
        JOptionPane.showMessageDialog(this, "Patient added!!", "Update",
                JOptionPane.INFORMATION_MESSAGE);
       ArrayList<Person> personList = personDirectory.getPersonDirectory();
        populatePatientsTable(personList);
        
             }
        txtPatientID.setText("");
        txtPurpose.setText("");
        txtDoctor.setText("");
        revalidate();
            repaint();
    }
    
    
    private void txtDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorActionPerformed

    private void txtPurposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurposeActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtBpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBpActionPerformed

    private void txtRespiratoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespiratoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespiratoryActionPerformed

    private void txtBp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBp1ActionPerformed

    private void txtRespiratory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespiratory1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespiratory1ActionPerformed

    private void txtWeight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeight1ActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
          int selectedRowIndex = tblPerson1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to Create Patient.");
            return;
        }
        setDefaultOptions1();
        paneCreatePatient.setVisible(true);
        int selectedRow= tblPerson1.getSelectedRow();
        var temp = tblPerson1.getValueAt(selectedRow, 0);
//        System.out.println(temp);
        this.selectedPerson = temp;

    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:
                  int selectedRowIndex = tblPerson1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add vitals.");
            return;
        }
        
        int selectedRow= tblPerson1.getSelectedRow();
        var temp = tblPerson1.getValueAt(selectedRow, 2);
        if(temp == "Not a Patient"){
            JOptionPane.showMessageDialog(this, "Not a Patient.","Error",
                    JOptionPane.ERROR_MESSAGE);
        }else{
                    setDefaultOptions1();
        paneAddVitals.setVisible(true);
        }
        
        
        

  
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void btnAddVitals1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitals1ActionPerformed
        
        int selectedRow= tblPerson1.getSelectedRow();
        Person person = (Person) tblPerson1.getValueAt(selectedRow, 0);
        VitalSigns vitalSign = new VitalSigns();
        Encounter encounter = new Encounter();
        encounter.setVisitedDate(new Date());
        Patient p = person.getPatient();
        EncounterHistory temp = p.getEncounterHistory();
//        Encounter previousEnconter = p.getEncounterHistory().getList().get(0);
        
        //getting doctors name and patient id
//        String docName = previousEnconter.getDoctorName();
                     if (txtHeart.getText().isEmpty() || txtBp.getText().isEmpty() || txtRespiratory.getText().isEmpty() || txtWeight.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter All Details");
        }
                     else{
        int heartRate = Integer.parseInt(txtHeart.getText());
        int bp = Integer.parseInt(txtBp.getText());
        int resRate = Integer.parseInt(txtRespiratory.getText());
        int weight = Integer.parseInt(txtWeight.getText());
        
        vitalSign.setHeartRate(heartRate);
        vitalSign.setBloodPressure(bp);
        vitalSign.setRespiratoryRate(resRate);
        vitalSign.setWeightPounds(weight);
        encounter.setVs(vitalSign);
        JOptionPane.showMessageDialog(this, "Vital Signs added!!", "Update",
                JOptionPane.INFORMATION_MESSAGE);
                     }
        ArrayList<Encounter> al = p.getEncounterHistory().getList();
        al.add(encounter);
        temp.setList(al);
        p.setEncounterHistory(temp);
        person.setVitalSign(vitalSign);
        txtHeart.setText("");
        txtBp.setText("");
        txtRespiratory.setText("");
        txtWeight.setText("");
    }//GEN-LAST:event_btnAddVitals1ActionPerformed

    private void btnViewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalsActionPerformed
          int selectedRowIndex = tblPerson1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view patient.");
            return;
        }
                int selectedRow= tblPerson1.getSelectedRow();
       Person person = (Person) tblPerson1.getValueAt(selectedRow, 0);
       

             var temp = tblPerson1.getValueAt(selectedRow, 2);
       var temp1 = person.getVitalSign();
      
        if(temp == "Not a Patient"){
            JOptionPane.showMessageDialog(this, "Not a Patient.","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(temp1 == null){
            JOptionPane.showMessageDialog(this, "No Vital signs added.","Error",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            
        setDefaultOptions1();
        paneViewVitals.setVisible(true);
        
        txtHeart1.setText(String.valueOf(temp1.getHeartRate()));
        txtRespiratory1.setText(String.valueOf(temp1.getRespiratoryRate()));
        txtBp1.setText(String.valueOf(temp1.getBloodPressure()));
        txtWeight1.setText(String.valueOf(temp1.getWeightPounds()));
        }
 
    }//GEN-LAST:event_btnViewVitalsActionPerformed
    
    protected void setDefaultOptions1() {

        paneCreatePatient.setVisible(false);
        paneAddVitals.setVisible(false);
        paneViewVitals.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JButton btnAddVitals1;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnViewVitals;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBp;
    private javax.swing.JLabel lblBp1;
    private javax.swing.JLabel lblCreatePatient;
    private javax.swing.JLabel lblCreatePatient1;
    private javax.swing.JLabel lblCreatePatient2;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHeartRate1;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPurpose;
    private javax.swing.JLabel lblRespiratory;
    private javax.swing.JLabel lblRespiratory1;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeight1;
    private javax.swing.JPanel paneAddVitals;
    private javax.swing.JPanel paneCreatePatient;
    private javax.swing.JPanel paneViewVitals;
    private javax.swing.JTable tblPerson1;
    private javax.swing.JTextField txtBp;
    private javax.swing.JTextField txtBp1;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtHeart;
    private javax.swing.JTextField txtHeart1;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtRespiratory;
    private javax.swing.JTextField txtRespiratory1;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtWeight1;
    // End of variables declaration//GEN-END:variables
}
