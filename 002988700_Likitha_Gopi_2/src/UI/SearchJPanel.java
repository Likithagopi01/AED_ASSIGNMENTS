/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarHistory;

/**
 *
 * @author Likitha G
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    CarHistory history;
    ArrayList<String> availability;
    ArrayList<String> availability1;
    ArrayList<String> brand;
    ArrayList<Integer> year;
    ArrayList<Integer> seats;
    ArrayList<String> serialnum;
    ArrayList<String> modelnum;
    ArrayList<String> manufacturer1;
    ArrayList<String> City;
    ArrayList<Car> availabilityCar;
    ArrayList<Car> availabilityCar1;
    ArrayList<Car> brandnames;
    ArrayList<Car> YearCar;
    ArrayList<Car> SeatsCar;
    ArrayList<Car> SerialnumCar;
    ArrayList<Car> ModelnumCar;
    ArrayList<Car> ManufacturerCar;
    ArrayList<Car> CityName;
    ArrayList<Car> CertificateYear;

    public SearchJPanel(CarHistory history) {
        initComponents();
        this.history = history;
        this.brand = new ArrayList();
        this.year = new ArrayList();
        this.seats = new ArrayList();
        this.serialnum = new ArrayList();
        this.modelnum = new ArrayList();
        this.manufacturer1 = new ArrayList<>();
        this.City = new ArrayList<>();

        pane11.setVisible(false);
        dropdown2.setVisible(false);
        dropdown3.setVisible(false);
//        dropdown4.setVisible(false);
//        dropdown41.setVisible(false);
        paneminmax.setVisible(false);
        paneserial.setVisible(false);
        panemodel.setVisible(false);
        panecity.setVisible(false);
        paneTime.setVisible(false);
        table17.setVisible(false);
        table18.setVisible(false);

//        for(String brand : getbrand())
//            dropdown2.addItem(brand);
//                
//        
//        for(int year : getYear())
//        dropdown3.addItem(String.valueOf(year));
//                
    }

    public ArrayList<String> getavailability() {

        for (Car ch : history.getHistory()) {
            availability.add(ch.getOccupied());
        }
        return availability;
    }
//        public ArrayList<String> getavailability1(){
//       
//        for(Car ch : history.getHistory()){
//        availability1.add(ch.getOccupied());
//        }
//        return availability1;
//       }

    public ArrayList<String> getbrand() {

        for (Car ch : history.getHistory()) {

            brand.add(ch.getBrand());
        }
        return brand;
    }

    public ArrayList<Integer> getYear() {

        for (Car ch : history.getHistory()) {

            year.add(ch.getYear());
        }

        return year;
    }

    public ArrayList<Integer> getseats() {

        for (Car ch : history.getHistory()) {

            seats.add(ch.getSeats());
        }

        return seats;
    }

    public ArrayList<String> getserialnums() {

        for (Car ch : history.getHistory()) {

            serialnum.add(ch.getSerial_number());
        }

        return serialnum;
    }

    public ArrayList<String> getModelnums() {

        for (Car ch : history.getHistory()) {

            modelnum.add(ch.getModel_number());
        }

        return modelnum;
    }

    public ArrayList<String> getCity1() {

        for (Car ch : history.getHistory()) {

            City.add(ch.getCity());
        }

        return City;
    }

    public ArrayList<Car> getavailability1(String avail) {
        this.availabilityCar1 = new ArrayList();
        for (Car ch : history.getHistory()) {
            if (avail.equals(ch.getOccupied())) {
                availabilityCar1.add(ch);
            }
        }
        return availabilityCar1;

    }

    public ArrayList<Car> getBrandName(String brandName1) {
        this.brandnames = new ArrayList();
        for (Car ch : history.getHistory()) {
            if (brandName1.equals(ch.getBrand())) {
                brandnames.add(ch);
            }
        }
        return brandnames;
    }

    public ArrayList<Car> getYear1(Integer year11) {
        this.YearCar = new ArrayList();
        for (Car ch : history.getHistory()) {
            if (year11.equals(ch.getYear())) {
                YearCar.add(ch);
            }
        }
        return YearCar;
    }

    public ArrayList<Car> getSeats1(Integer minSeat, Integer maxSeat) {
        this.SeatsCar = new ArrayList();
        for (var i = minSeat; i <= maxSeat; i++) {
            for (Car ch : history.getHistory()) {
                if (i.equals(ch.getSeats())) {
                    SeatsCar.add(ch);
                }
            }
        }
        return SeatsCar;
    }

    public ArrayList<Car> getserialnum1(Integer serial) {
        this.SerialnumCar = new ArrayList();
        for (Car ch : history.getHistory()) {
            if (serial.equals(ch.getSerial_number())) {
                SerialnumCar.add(ch);
            }
        }
        return SerialnumCar;
    }

    public ArrayList<Car> getModelnum(String model) {
        this.ModelnumCar = new ArrayList();
        for (Car ch : history.getHistory()) {
            if (model.equals(ch.getModel_number())) {
                ModelnumCar.add(ch);
            }
        }
        return ModelnumCar;
    }

    public ArrayList<Car> getCityName1(String cityname) {
        this.CityName = new ArrayList();
        for (Car ch : history.getHistory()) {
            if (cityname.equals(ch.getCity())) {
                CityName.add(ch);
            }
        }
        return CityName;
    }

    public ArrayList<Car> getmanufacturers() {

        this.ManufacturerCar = new ArrayList();
        List<String> list = new ArrayList<String>();

        for (Car ch : history.getHistory()) {
            if (!list.contains(ch.getBrand())) {
                ManufacturerCar.add(ch);
                list.add(ch.getBrand());
            }

        }
        return ManufacturerCar;
    }

    public ArrayList<Car> getCertiYear() {
        this.CertificateYear = new ArrayList();
        for (Car ch : history.getHistory()) {
            int d = java.time.LocalDate.now().getYear();
            if (ch.getCerti_year() <= d) {
                CertificateYear.add(ch);
            }
        }
        return CertificateYear;
    }

    private void getLastUpdated() throws ParseException {
        List<Date> date = new ArrayList();
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);
        for (Car ch : history.getHistory()) {
            Date date1 = format.parse(ch.getTime());
            date.add(date1);
        }
        var last = Collections.max(date);
        System.out.println(last);
        txtTime.setText(last.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dropdown = new javax.swing.JComboBox<>();
        dropdown2 = new javax.swing.JComboBox<>();
        dropdown3 = new javax.swing.JComboBox<>();
        table17 = new javax.swing.JScrollPane();
        tblCar1 = new javax.swing.JTable();
        btncheckavail = new javax.swing.JButton();
        pane11 = new javax.swing.JPanel();
        txtAvail = new javax.swing.JTextField();
        lblAvail = new javax.swing.JLabel();
        txtNotAvail = new javax.swing.JTextField();
        lblNotAvail = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        btnFirstAvail = new javax.swing.JButton();
        btnManufacturers = new javax.swing.JButton();
        table18 = new javax.swing.JScrollPane();
        tblCar2 = new javax.swing.JTable();
        paneserial = new javax.swing.JPanel();
        lblserial = new javax.swing.JLabel();
        txtserial1 = new javax.swing.JTextField();
        panemodel = new javax.swing.JPanel();
        lblmodel = new javax.swing.JLabel();
        txtmodel1 = new javax.swing.JTextField();
        paneminmax = new javax.swing.JPanel();
        dropdown41 = new javax.swing.JComboBox<>();
        dropdown4 = new javax.swing.JComboBox<>();
        btnsubmit = new javax.swing.JButton();
        panecity = new javax.swing.JPanel();
        lblcity1 = new javax.swing.JLabel();
        txtcity1 = new javax.swing.JTextField();
        paneTime = new javax.swing.JPanel();
        txtTime = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        dropdown.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dropdown.setMaximumRowCount(15);
        dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT.... ", "List all cars", "List all cars year", "List all the cars with seats", "find car with given serial number", "list cars model number", "list cars city", "list cars having expired certificate" }));
        dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownActionPerformed(evt);
            }
        });

        dropdown2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        dropdown2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT BRAND", "TOYOTA", "TESLA", "BMW", "BENZ", "FERRARI" }));
        dropdown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdown2ActionPerformed(evt);
            }
        });

        dropdown3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        dropdown3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YEAR..", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        dropdown3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdown3ActionPerformed(evt);
            }
        });

        tblCar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblCar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Registration Date", "Availability", "Brand", "Manufacturing  Date", "City", "No of Seats", "Serial Number", "Model Number", "Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table17.setViewportView(tblCar1);

        btncheckavail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncheckavail.setText("CHECK AVAILABLE CAR");
        btncheckavail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckavailActionPerformed(evt);
            }
        });

        pane11.setBackground(new java.awt.Color(153, 153, 153));

        txtAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailActionPerformed(evt);
            }
        });

        lblAvail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAvail.setText("Available");

        lblNotAvail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNotAvail.setText("Not Available");

        javax.swing.GroupLayout pane11Layout = new javax.swing.GroupLayout(pane11);
        pane11.setLayout(pane11Layout);
        pane11Layout.setHorizontalGroup(
            pane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane11Layout.createSequentialGroup()
                        .addComponent(lblAvail)
                        .addGap(34, 34, 34)
                        .addComponent(lblNotAvail))
                    .addGroup(pane11Layout.createSequentialGroup()
                        .addComponent(txtAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(txtNotAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pane11Layout.setVerticalGroup(
            pane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane11Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvail)
                    .addComponent(lblNotAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNotAvail, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtAvail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnupdate.setText("LAST UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnFirstAvail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnFirstAvail.setText("FIRST AVAILALE CAR");
        btnFirstAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailActionPerformed(evt);
            }
        });

        btnManufacturers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManufacturers.setText("MANUFACTURERS");
        btnManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturersActionPerformed(evt);
            }
        });

        tblCar2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblCar2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Manufacturers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table18.setViewportView(tblCar2);

        paneserial.setBackground(new java.awt.Color(153, 153, 153));

        lblserial.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblserial.setText("ENTER SERIAL NUMBER");

        txtserial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserial1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneserialLayout = new javax.swing.GroupLayout(paneserial);
        paneserial.setLayout(paneserialLayout);
        paneserialLayout.setHorizontalGroup(
            paneserialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneserialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneserialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtserial1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblserial))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        paneserialLayout.setVerticalGroup(
            paneserialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneserialLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblserial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtserial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panemodel.setBackground(new java.awt.Color(153, 153, 153));

        lblmodel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblmodel.setText("MODEL NAME");

        txtmodel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panemodelLayout = new javax.swing.GroupLayout(panemodel);
        panemodel.setLayout(panemodelLayout);
        panemodelLayout.setHorizontalGroup(
            panemodelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panemodelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panemodelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmodel)
                    .addComponent(txtmodel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panemodelLayout.setVerticalGroup(
            panemodelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panemodelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblmodel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmodel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        paneminmax.setBackground(new java.awt.Color(153, 153, 153));

        dropdown41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN", "4", "5", "6", "7", "8", "9" }));
        dropdown41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdown41ActionPerformed(evt);
            }
        });

        dropdown4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAX", "4", "5", "6", "7", "8", "9" }));
        dropdown4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdown4ActionPerformed(evt);
            }
        });

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneminmaxLayout = new javax.swing.GroupLayout(paneminmax);
        paneminmax.setLayout(paneminmaxLayout);
        paneminmaxLayout.setHorizontalGroup(
            paneminmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneminmaxLayout.createSequentialGroup()
                .addGroup(paneminmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneminmaxLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dropdown41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dropdown4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneminmaxLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnsubmit)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        paneminmaxLayout.setVerticalGroup(
            paneminmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneminmaxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneminmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropdown41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdown4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsubmit)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panecity.setBackground(new java.awt.Color(153, 153, 153));

        lblcity1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblcity1.setText("ENTER CITY NAME");

        txtcity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcity1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panecityLayout = new javax.swing.GroupLayout(panecity);
        panecity.setLayout(panecityLayout);
        panecityLayout.setHorizontalGroup(
            panecityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panecityLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panecityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcity1)
                    .addComponent(txtcity1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panecityLayout.setVerticalGroup(
            panecityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panecityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcity1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        paneTime.setBackground(new java.awt.Color(153, 153, 153));

        txtTime.setText(" ");
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTime.setText("LAST UPDATED TIME");

        javax.swing.GroupLayout paneTimeLayout = new javax.swing.GroupLayout(paneTime);
        paneTime.setLayout(paneTimeLayout);
        paneTimeLayout.setHorizontalGroup(
            paneTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTime)
                    .addGroup(paneTimeLayout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addGap(0, 221, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneTimeLayout.setVerticalGroup(
            paneTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTimeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paneTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panecity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropdown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneserial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneminmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panemodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(table17, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(table18, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirstAvail)
                                .addGap(14, 14, 14)
                                .addComponent(btncheckavail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnManufacturers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupdate)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirstAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncheckavail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panemodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paneminmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paneserial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dropdown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panecity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paneTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed

        setDefaultOptions();
        String selectedvalue = dropdown.getSelectedItem().toString();

        if (selectedvalue.equals("List all cars")) {

            dropdown2.setVisible(true);
        }

        if (!selectedvalue.equals("List all cars")) {

            dropdown2.setVisible(false);
            table17.setVisible(false);
        }

        if (selectedvalue.equals("List all cars year")) {

            dropdown3.setVisible(true);
        }

        if (!selectedvalue.equals("List all cars year")) {

            dropdown3.setVisible(false);
            table17.setVisible(false);
        }

        if (selectedvalue.equals("List all the cars with seats")) {

            paneminmax.setVisible(true);
        }

        if (!selectedvalue.equals("List all the cars with seats")) {

            paneminmax.setVisible(false);
            table17.setVisible(false);
        }

        if (selectedvalue.equals("find car with given serial number")) {

            paneserial.setVisible(true);
            revalidate();
            repaint();
        }

        if (!selectedvalue.equals("find car with given serial number")) {

            paneserial.setVisible(false);
            table17.setVisible(false);
        }

        if (selectedvalue.equals("list cars model number")) {

            panemodel.setVisible(true);
            revalidate();
            repaint();
        }

        if (!selectedvalue.equals("list cars model number")) {

            panemodel.setVisible(false);
            table17.setVisible(false);
        }

        if (selectedvalue.equals("list cars city")) {

            panecity.setVisible(true);
            revalidate();
            repaint();
        }

        if (!selectedvalue.equals("list cars city")) {

            panecity.setVisible(false);
            table17.setVisible(false);
        }

        if (selectedvalue.equals("list cars having expired certificate")) {

            getCertiYear();
            cartable8();
            table17.setVisible(true);
            revalidate();
            repaint();
        }

        if (!selectedvalue.equals("list cars having expired certificate")) {

            table17.setVisible(false);

        }


    }//GEN-LAST:event_dropdownActionPerformed

    private void dropdown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdown2ActionPerformed
        // TODO add your handling code here:

        String selectedvalue1 = dropdown2.getSelectedItem().toString();

        if (selectedvalue1.equals("SELECT...")) {

            table17.setVisible(true);
            revalidate();
            repaint();
        }

        getBrandName(selectedvalue1);
        cartable1();
        table17.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_dropdown2ActionPerformed

    private void dropdown3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdown3ActionPerformed
        // TODO add your handling code here:

        int selectedvalue2 = Integer.parseInt((String) dropdown3.getSelectedItem());

        getYear1(selectedvalue2);
        cartable2();
        table17.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_dropdown3ActionPerformed

    private void dropdown4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdown4ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_dropdown4ActionPerformed

    private void txtserial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserial1ActionPerformed
        // TODO add your handling code here:

        int selectedvalue4 = Integer.parseInt(txtserial1.getText());

        getserialnum1(selectedvalue4);
        cartable4();
        table17.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_txtserial1ActionPerformed

    private void dropdown41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdown41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdown41ActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed

        String selectedvalue11 = dropdown.getSelectedItem().toString();

        if (selectedvalue11.equals("List all the cars with seats")) {
            int selectedvalue3 = Integer.parseInt((String) dropdown4.getSelectedItem());
            int selectedvalue31 = Integer.parseInt((String) dropdown41.getSelectedItem());

            getSeats1(selectedvalue31, selectedvalue3);
            cartable3();
            table17.setVisible(true);
            revalidate();
            repaint();
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btncheckavailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckavailActionPerformed
        // TODO add your handling code here:

        setDefaultOptions();
        pane11.setVisible(true);

        int CarTotal = 0;
        int countCarAvail = 0;
        int countCarUnAvail = 0;
        for (Car ch : history.getHistory()) {
            CarTotal++;
            if (ch.getOccupied() == "yes" || ch.getOccupied() == "Yes" || ch.getOccupied() == "YES") {
                countCarAvail++;
            }
        }
        countCarUnAvail = CarTotal - countCarAvail;
        txtAvail.setText(String.valueOf(countCarAvail));
        txtNotAvail.setText(String.valueOf(countCarUnAvail));

    }//GEN-LAST:event_btncheckavailActionPerformed

    protected void setDefaultOptions() {

        pane11.setVisible(false);
        table17.setVisible(false);
        paneminmax.setVisible(false);
        paneserial.setVisible(false);
        panemodel.setVisible(false);
        table18.setVisible(false);
        dropdown2.setVisible(false);
        dropdown3.setVisible(false);
        paneTime.setVisible(false);
    }

    private void txtAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailActionPerformed

    private void txtmodel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodel1ActionPerformed
        // TODO add your handling code here:

        String selectedvalue5 = txtmodel1.getText();

        getModelnum(selectedvalue5);
        cartable5();
        table17.setVisible(true);
        revalidate();
        repaint();

    }//GEN-LAST:event_txtmodel1ActionPerformed

    private void btnFirstAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailActionPerformed
        // TODO add your handling code here:

        setDefaultOptions();

        table17.setVisible(true);

        revalidate();
        repaint();
        for (Car ch : history.getHistory()) {
            String data = ch.getOccupied();
            if (data == "yes" || data == "Yes") {
                getavailability1(data);
                cartable6();
            }

        }

    }//GEN-LAST:event_btnFirstAvailActionPerformed

    private void btnManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturersActionPerformed
        // TODO add your handling code here:
        setDefaultOptions();
        table18.setVisible(true);
        revalidate();
        repaint();
        getmanufacturers();
//        for (Car ch : history.getHistory()) {
//            if (!list.contains(ch.getBrand())) {
//                getmanufacturers(ch.getBrand());
//                list.add(ch.getBrand());
//                
//            }
//        }
        cartable9();

    }//GEN-LAST:event_btnManufacturersActionPerformed

    private void txtcity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcity1ActionPerformed
        // TODO add your handling code here:

        String selectedvalue6 = txtcity1.getText();
        getCityName1(selectedvalue6);
        cartable7();
        table17.setVisible(true);
        revalidate();
        repaint();

    }//GEN-LAST:event_txtcity1ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

     setDefaultOptions();
     paneTime.setVisible(true);


        try {
            // TODO add your handling code here:
            getLastUpdated();
            
        } catch (ParseException ex) {
            Logger.getLogger(SearchJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
        txtTime.setEditable(false);
    }//GEN-LAST:event_txtTimeActionPerformed

    private void cartable1() {
        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());

        for (Car CAR : brandnames) {

            Object[] row = new Object[9];
            row[0] = CAR.getRegistration_date();
            row[1] = CAR.getOccupied();
            row[2] = CAR.getBrand();
            row[3] = CAR.getYear();
            row[4] = CAR.getCity();
            row[5] = CAR.getSeats();
            row[6] = CAR.getSerial_number();
            row[7] = CAR.getModel_number();
            row[8] = CAR.getCerti_year();

            model.addRow(row);

        }
    }

    private void cartable2() {
        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());

        for (Car CAR : YearCar) {

            Object[] row = new Object[9];
            row[0] = CAR.getRegistration_date();
            row[1] = CAR.getOccupied();
            row[2] = CAR.getBrand();
            row[3] = CAR.getYear();
            row[4] = CAR.getCity();
            row[5] = CAR.getSeats();
            row[6] = CAR.getSerial_number();
            row[7] = CAR.getModel_number();
            row[8] = CAR.getCerti_year();

            model.addRow(row);

        }
    }

    private void cartable3() {
        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());

        for (Car CAR : SeatsCar) {

            Object[] row = new Object[9];
            row[0] = CAR.getRegistration_date();
            row[1] = CAR.getOccupied();
            row[2] = CAR.getBrand();
            row[3] = CAR.getYear();
            row[4] = CAR.getCity();
            row[5] = CAR.getSeats();
            row[6] = CAR.getSerial_number();
            row[7] = CAR.getModel_number();
            row[8] = CAR.getCerti_year();

            model.addRow(row);

        }
    }

    private void cartable4() {
        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());

        for (Car CAR : SerialnumCar) {

            Object[] row = new Object[9];
            row[0] = CAR.getRegistration_date();
            row[1] = CAR.getOccupied();
            row[2] = CAR.getBrand();
            row[3] = CAR.getYear();
            row[4] = CAR.getCity();
            row[5] = CAR.getSeats();
            row[6] = CAR.getSerial_number();
            row[7] = CAR.getModel_number();
            row[8] = CAR.getCerti_year();

            model.addRow(row);

        }
    }

    private void cartable5() {
        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());

        for (Car CAR : ModelnumCar) {

            Object[] row = new Object[9];
            row[0] = CAR.getRegistration_date();
            row[1] = CAR.getOccupied();
            row[2] = CAR.getBrand();
            row[3] = CAR.getYear();
            row[4] = CAR.getCity();
            row[5] = CAR.getSeats();
            row[6] = CAR.getSerial_number();
            row[7] = CAR.getModel_number();
            row[8] = CAR.getCerti_year();

            model.addRow(row);

        }
    }

    private void cartable6() {
        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());
        var temp = availabilityCar1.get(0);

        Object[] row = new Object[9];
        row[0] = temp.getRegistration_date();
        row[1] = temp.getOccupied();
        row[2] = temp.getBrand();
        row[3] = temp.getYear();
        row[4] = temp.getCity();
        row[5] = temp.getSeats();
        row[6] = temp.getSerial_number();
        row[7] = temp.getModel_number();
        row[8] = temp.getCerti_year();

        model.addRow(row);

    }

    private void cartable7() {

        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());

        for (Car CAR : CityName) {

            Object[] row = new Object[9];
            row[0] = CAR.getRegistration_date();
            row[1] = CAR.getOccupied();
            row[2] = CAR.getBrand();
            row[3] = CAR.getYear();
            row[4] = CAR.getCity();
            row[5] = CAR.getSeats();
            row[6] = CAR.getSerial_number();
            row[7] = CAR.getModel_number();
            row[8] = CAR.getCerti_year();

            model.addRow(row);

        }
    }

    private void cartable8() {

        DefaultTableModel model = (DefaultTableModel) tblCar1.getModel();

        model.setRowCount(0);
//        System.out.println("size"+ history.getHistory().size());

        for (Car CAR : CertificateYear) {

            Object[] row = new Object[9];
            row[0] = CAR.getRegistration_date();
            row[1] = CAR.getOccupied();
            row[2] = CAR.getBrand();
            row[3] = CAR.getYear();
            row[4] = CAR.getCity();
            row[5] = CAR.getSeats();
            row[6] = CAR.getSerial_number();
            row[7] = CAR.getModel_number();
            row[8] = CAR.getCerti_year();

            model.addRow(row);

        }

    }

    private void cartable9() {

        DefaultTableModel model = (DefaultTableModel) tblCar2.getModel();

        model.setRowCount(0);
        List<String> list = new ArrayList();
//        System.out.println("size"+ history.getHistory().size());
        Object[] row = new Object[1];
        Object[] temp = new Object[1];
        for (Car CAR : ManufacturerCar) {

            row[0] = CAR.getBrand();
            list.add(CAR.getBrand());
            model.addRow(row);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirstAvail;
    private javax.swing.JButton btnManufacturers;
    private javax.swing.JButton btncheckavail;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JComboBox<String> dropdown2;
    private javax.swing.JComboBox<String> dropdown3;
    private javax.swing.JComboBox<String> dropdown4;
    private javax.swing.JComboBox<String> dropdown41;
    private javax.swing.JLabel lblAvail;
    private javax.swing.JLabel lblNotAvail;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblcity1;
    private javax.swing.JLabel lblmodel;
    private javax.swing.JLabel lblserial;
    private javax.swing.JPanel pane11;
    private javax.swing.JPanel paneTime;
    private javax.swing.JPanel panecity;
    private javax.swing.JPanel paneminmax;
    private javax.swing.JPanel panemodel;
    private javax.swing.JPanel paneserial;
    private javax.swing.JScrollPane table17;
    private javax.swing.JScrollPane table18;
    private javax.swing.JTable tblCar1;
    private javax.swing.JTable tblCar2;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtNotAvail;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtcity1;
    private javax.swing.JTextField txtmodel1;
    private javax.swing.JTextField txtserial1;
    // End of variables declaration//GEN-END:variables

}
