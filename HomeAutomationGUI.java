package homeentertainmentautomation;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.Timer;

public class HomeAutomationGUI extends javax.swing.JFrame {
    
    private Timer timer;
    private Timer timer2;
    private Timer timer3;
    private Timer alarm;
    
    private int timerLength;
    private int imageTracker;
    
    public HomeAutomationGUI() {
        
        initComponents();
        postInitComponents();
        
    }
    
    private void postInitComponents() {
        
        background.setVisible(true);
        background.setEnabled(true);
        screenInitMenu.setVisible(true);
        screenInitMenu.setEnabled(true);
        screenSelectionMenu.setVisible(false);
        screenSelectionMenu.setEnabled(false);
        kitchenMenu.setVisible(true);
        kitchenMenu.setEnabled(true);
        bathroomMenu.setVisible(false);
        bathroomMenu.setEnabled(false);
        bedroomMenu.setVisible(false);
        bedroomMenu.setEnabled(false);
        
        imageTracker = 0;
        
        alarm = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });
        
        timer3 = new Timer(15000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(imageTracker) {
                    case 0:
                        bathroomMenuImage.changeImage("/homeentertainmentautomation/resources/funfact2.png");
                        imageTracker++;
                        break;
                    case 1:
                        bathroomMenuImage.changeImage("/homeentertainmentautomation/resources/funfact3.png");
                        imageTracker++;
                        break;
                    case 2:
                        bathroomMenuImage.changeImage("/homeentertainmentautomation/resources/funfact4.png");
                        imageTracker++;
                        break;
                    case 3:
                        bathroomMenuImage.changeImage("/homeentertainmentautomation/resources/funfact1.png");
                        imageTracker = 0;
                        break;
                    default:
                        break;
                }
            }
        });
        
        timer2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar cal = Calendar.getInstance();
                if((cal.getTime().getHours() == Integer.parseInt(hourComboBox.getSelectedItem().toString())) &&
                        cal.getTime().getMinutes() == Integer.parseInt(minuteComboBox.getSelectedItem().toString())) {
                    alarm.start();
                }
            }
        });
        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kitchenMenuTimerText.setText(String.valueOf(timerLength));
                timerLength--;
                if(timerLength < 0) {
                    kitchenMenuTimerText.setText("");
                    Toolkit.getDefaultToolkit().beep();
                    timer.stop();
                }
            }
        });
        
        for(int i = 1; i <= 12; i++) {
            hourComboBox.addItem(Integer.toString(i));
        }
        
        for(int i = 1; i <= 60; i++) {
            minuteComboBox.addItem(Integer.toString(i));
        }
        
        dayHalfComboBox.addItem("AM");
        dayHalfComboBox.addItem("PM");
        
        hourComboBox.setSelectedIndex(0);
        minuteComboBox.setSelectedIndex(0);
        dayHalfComboBox.setSelectedIndex(0);
        
    }
    
    private void updateAlarmText() {
        String hour, minute;
        try {
            
            if(Integer.parseInt(hourComboBox.getSelectedItem().toString()) < 10)
                hour = "0" + hourComboBox.getSelectedItem().toString();
            else
                hour = hourComboBox.getSelectedItem().toString();

            if(Integer.parseInt(minuteComboBox.getSelectedItem().toString()) < 10)
                minute = "0" + minuteComboBox.getSelectedItem().toString();
            else
                minute = minuteComboBox.getSelectedItem().toString();
        
            alarmClockText.setText(hour + ":" + minute + " " +
                               dayHalfComboBox.getSelectedItem().toString());
        
        } catch(java.lang.NullPointerException ex) {
            System.out.println(ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        screenSelectionMenu = new javax.swing.JPanel();
        selectionPanel = new javax.swing.JPanel();
        selectionPanelTopInset = new javax.swing.JPanel();
        selectionPanelLeftInset = new javax.swing.JPanel();
        selectionPanelRightInset = new javax.swing.JPanel();
        selectionPanelBottomInset = new javax.swing.JPanel();
        kitchenButton = new javax.swing.JButton();
        selectionPanelMiddleInset1 = new javax.swing.JPanel();
        bedroomButton = new javax.swing.JButton();
        selectionPanelMiddleInset3 = new javax.swing.JPanel();
        bathroomButton = new javax.swing.JButton();
        screenSelectionMenuRightInset = new javax.swing.JPanel();
        screenInitMenu = new javax.swing.JPanel();
        homeButton = new homeentertainmentautomation.customcomponents.JImagePanel("/homeentertainmentautomation/resources/housebutton.png");
        screenInitMenuTopInset = new javax.swing.JPanel();
        screenInitMenuLeftInset = new javax.swing.JPanel();
        screenInitMenuRightInset = new javax.swing.JPanel();
        screenInitMenuBottomInset = new javax.swing.JPanel();
        kitchenMenu = new javax.swing.JPanel();
        kitchenMenuTopInset = new javax.swing.JPanel();
        kitchenMenuLeftInset = new javax.swing.JPanel();
        kitchenMenuTimerText = new javax.swing.JLabel();
        kitchenMenuRightInset = new javax.swing.JPanel();
        oneSec = new javax.swing.JButton();
        twoSec = new javax.swing.JButton();
        threeSec = new javax.swing.JButton();
        fourSec = new javax.swing.JButton();
        fiveSec = new javax.swing.JButton();
        sixSec = new javax.swing.JButton();
        sevenSec = new javax.swing.JButton();
        eightSec = new javax.swing.JButton();
        nineSec = new javax.swing.JButton();
        tenSec = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        kitchenMenuBottomInset = new javax.swing.JPanel();
        bedroomMenu = new javax.swing.JPanel();
        bedroomMenuTopInset = new javax.swing.JPanel();
        bedroomMenuLeftInset = new javax.swing.JPanel();
        alarmClockDisplay = new javax.swing.JPanel();
        alarmClockText = new javax.swing.JLabel();
        bedroomMenuRightInset = new javax.swing.JPanel();
        bedroomMenuMiddleInset = new javax.swing.JPanel();
        hourComboBox = new javax.swing.JComboBox<>();
        hourInset = new javax.swing.JPanel();
        minuteComboBox = new javax.swing.JComboBox<>();
        minuteInset = new javax.swing.JPanel();
        dayHalfComboBox = new javax.swing.JComboBox<>();
        bedroomMenuBottomInset = new javax.swing.JPanel();
        bathroomMenu = new javax.swing.JPanel();
        bathroomMenuTopInset = new javax.swing.JPanel();
        bathroomMenuLeftInset = new javax.swing.JPanel();
        bathroomMenuImage = new homeentertainmentautomation.customcomponents.JImagePanel("/homeentertainmentautomation/resources/funfact1.png");
        bathroomMenuRightInset = new javax.swing.JPanel();
        bathroomMenuBottomInset = new javax.swing.JPanel();
        clockPanel = new javax.swing.JPanel();
        clockPanelTopInset = new javax.swing.JPanel();
        clockPanelLeftInset = new javax.swing.JPanel();
        clockThread = new homeentertainmentautomation.customcomponents.JDatePanel();
        clockPanelRightInset = new javax.swing.JPanel();
        clockPanelBottomInset = new javax.swing.JPanel();
        background = new homeentertainmentautomation.customcomponents.JImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        screenSelectionMenu.setOpaque(false);
        screenSelectionMenu.setLayout(new java.awt.GridBagLayout());

        selectionPanel.setBackground(new java.awt.Color(0, 0, 0, 100));
        selectionPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        selectionPanel.setPreferredSize(new java.awt.Dimension(160, 720));
        selectionPanel.setLayout(new java.awt.GridBagLayout());

        selectionPanelTopInset.setOpaque(false);
        selectionPanelTopInset.setPreferredSize(new java.awt.Dimension(160, 20));

        javax.swing.GroupLayout selectionPanelTopInsetLayout = new javax.swing.GroupLayout(selectionPanelTopInset);
        selectionPanelTopInset.setLayout(selectionPanelTopInsetLayout);
        selectionPanelTopInsetLayout.setHorizontalGroup(
            selectionPanelTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selectionPanelTopInsetLayout.setVerticalGroup(
            selectionPanelTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.02778;
        selectionPanel.add(selectionPanelTopInset, gridBagConstraints);

        selectionPanelLeftInset.setOpaque(false);
        selectionPanelLeftInset.setPreferredSize(new java.awt.Dimension(15, 350));

        javax.swing.GroupLayout selectionPanelLeftInsetLayout = new javax.swing.GroupLayout(selectionPanelLeftInset);
        selectionPanelLeftInset.setLayout(selectionPanelLeftInsetLayout);
        selectionPanelLeftInsetLayout.setHorizontalGroup(
            selectionPanelLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selectionPanelLeftInsetLayout.setVerticalGroup(
            selectionPanelLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.09375;
        gridBagConstraints.weighty = 0.4861;
        selectionPanel.add(selectionPanelLeftInset, gridBagConstraints);

        selectionPanelRightInset.setOpaque(false);
        selectionPanelRightInset.setPreferredSize(new java.awt.Dimension(15, 350));

        javax.swing.GroupLayout selectionPanelRightInsetLayout = new javax.swing.GroupLayout(selectionPanelRightInset);
        selectionPanelRightInset.setLayout(selectionPanelRightInsetLayout);
        selectionPanelRightInsetLayout.setHorizontalGroup(
            selectionPanelRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selectionPanelRightInsetLayout.setVerticalGroup(
            selectionPanelRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.09375;
        gridBagConstraints.weighty = 0.4861;
        selectionPanel.add(selectionPanelRightInset, gridBagConstraints);

        selectionPanelBottomInset.setOpaque(false);
        selectionPanelBottomInset.setPreferredSize(new java.awt.Dimension(160, 450));

        javax.swing.GroupLayout selectionPanelBottomInsetLayout = new javax.swing.GroupLayout(selectionPanelBottomInset);
        selectionPanelBottomInset.setLayout(selectionPanelBottomInsetLayout);
        selectionPanelBottomInsetLayout.setHorizontalGroup(
            selectionPanelBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selectionPanelBottomInsetLayout.setVerticalGroup(
            selectionPanelBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.625;
        selectionPanel.add(selectionPanelBottomInset, gridBagConstraints);

        kitchenButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        kitchenButton.setText("Kitchen");
        kitchenButton.setMaximumSize(new java.awt.Dimension(30000, 30000));
        kitchenButton.setMinimumSize(new java.awt.Dimension(0, 0));
        kitchenButton.setPreferredSize(new java.awt.Dimension(130, 50));
        kitchenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kitchenButtonMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8125;
        gridBagConstraints.weighty = 0.06944;
        selectionPanel.add(kitchenButton, gridBagConstraints);

        selectionPanelMiddleInset1.setOpaque(false);
        selectionPanelMiddleInset1.setPreferredSize(new java.awt.Dimension(130, 50));

        javax.swing.GroupLayout selectionPanelMiddleInset1Layout = new javax.swing.GroupLayout(selectionPanelMiddleInset1);
        selectionPanelMiddleInset1.setLayout(selectionPanelMiddleInset1Layout);
        selectionPanelMiddleInset1Layout.setHorizontalGroup(
            selectionPanelMiddleInset1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selectionPanelMiddleInset1Layout.setVerticalGroup(
            selectionPanelMiddleInset1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8125;
        gridBagConstraints.weighty = 0.06944;
        selectionPanel.add(selectionPanelMiddleInset1, gridBagConstraints);

        bedroomButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bedroomButton.setText("Bedroom");
        bedroomButton.setMaximumSize(new java.awt.Dimension(30000, 30000));
        bedroomButton.setMinimumSize(new java.awt.Dimension(0, 0));
        bedroomButton.setPreferredSize(new java.awt.Dimension(130, 50));
        bedroomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bedroomButtonMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8125;
        gridBagConstraints.weighty = 0.06944;
        selectionPanel.add(bedroomButton, gridBagConstraints);

        selectionPanelMiddleInset3.setOpaque(false);
        selectionPanelMiddleInset3.setPreferredSize(new java.awt.Dimension(130, 50));

        javax.swing.GroupLayout selectionPanelMiddleInset3Layout = new javax.swing.GroupLayout(selectionPanelMiddleInset3);
        selectionPanelMiddleInset3.setLayout(selectionPanelMiddleInset3Layout);
        selectionPanelMiddleInset3Layout.setHorizontalGroup(
            selectionPanelMiddleInset3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selectionPanelMiddleInset3Layout.setVerticalGroup(
            selectionPanelMiddleInset3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8125;
        gridBagConstraints.weighty = 0.06944;
        selectionPanel.add(selectionPanelMiddleInset3, gridBagConstraints);

        bathroomButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bathroomButton.setText("Bathroom");
        bathroomButton.setMaximumSize(new java.awt.Dimension(30000, 30000));
        bathroomButton.setMinimumSize(new java.awt.Dimension(0, 0));
        bathroomButton.setPreferredSize(new java.awt.Dimension(130, 50));
        bathroomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bathroomButtonMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8125;
        gridBagConstraints.weighty = 0.06944;
        selectionPanel.add(bathroomButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.125;
        gridBagConstraints.weighty = 1.0;
        screenSelectionMenu.add(selectionPanel, gridBagConstraints);

        screenSelectionMenuRightInset.setMinimumSize(new java.awt.Dimension(0, 0));
        screenSelectionMenuRightInset.setOpaque(false);
        screenSelectionMenuRightInset.setPreferredSize(new java.awt.Dimension(1120, 720));
        screenSelectionMenuRightInset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                screenSelectionMenuRightInsetMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout screenSelectionMenuRightInsetLayout = new javax.swing.GroupLayout(screenSelectionMenuRightInset);
        screenSelectionMenuRightInset.setLayout(screenSelectionMenuRightInsetLayout);
        screenSelectionMenuRightInsetLayout.setHorizontalGroup(
            screenSelectionMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        screenSelectionMenuRightInsetLayout.setVerticalGroup(
            screenSelectionMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.875;
        gridBagConstraints.weighty = 1.0;
        screenSelectionMenu.add(screenSelectionMenuRightInset, gridBagConstraints);

        getContentPane().add(screenSelectionMenu);

        screenInitMenu.setOpaque(false);
        screenInitMenu.setLayout(new java.awt.GridBagLayout());

        homeButton.setMinimumSize(new java.awt.Dimension(0, 0));
        homeButton.setPreferredSize(new java.awt.Dimension(75, 75));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.0586;
        gridBagConstraints.weighty = 0.10417;
        screenInitMenu.add(homeButton, gridBagConstraints);

        screenInitMenuTopInset.setMinimumSize(new java.awt.Dimension(0, 0));
        screenInitMenuTopInset.setOpaque(false);
        screenInitMenuTopInset.setPreferredSize(new java.awt.Dimension(1280, 10));

        javax.swing.GroupLayout screenInitMenuTopInsetLayout = new javax.swing.GroupLayout(screenInitMenuTopInset);
        screenInitMenuTopInset.setLayout(screenInitMenuTopInsetLayout);
        screenInitMenuTopInsetLayout.setHorizontalGroup(
            screenInitMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        screenInitMenuTopInsetLayout.setVerticalGroup(
            screenInitMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01389;
        screenInitMenu.add(screenInitMenuTopInset, gridBagConstraints);

        screenInitMenuLeftInset.setMinimumSize(new java.awt.Dimension(0, 0));
        screenInitMenuLeftInset.setOpaque(false);
        screenInitMenuLeftInset.setPreferredSize(new java.awt.Dimension(10, 75));

        javax.swing.GroupLayout screenInitMenuLeftInsetLayout = new javax.swing.GroupLayout(screenInitMenuLeftInset);
        screenInitMenuLeftInset.setLayout(screenInitMenuLeftInsetLayout);
        screenInitMenuLeftInsetLayout.setHorizontalGroup(
            screenInitMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        screenInitMenuLeftInsetLayout.setVerticalGroup(
            screenInitMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.0078125;
        gridBagConstraints.weighty = 0.10417;
        screenInitMenu.add(screenInitMenuLeftInset, gridBagConstraints);

        screenInitMenuRightInset.setMinimumSize(new java.awt.Dimension(0, 0));
        screenInitMenuRightInset.setOpaque(false);
        screenInitMenuRightInset.setPreferredSize(new java.awt.Dimension(1195, 75));

        javax.swing.GroupLayout screenInitMenuRightInsetLayout = new javax.swing.GroupLayout(screenInitMenuRightInset);
        screenInitMenuRightInset.setLayout(screenInitMenuRightInsetLayout);
        screenInitMenuRightInsetLayout.setHorizontalGroup(
            screenInitMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        screenInitMenuRightInsetLayout.setVerticalGroup(
            screenInitMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.9336;
        gridBagConstraints.weighty = 0.10417;
        screenInitMenu.add(screenInitMenuRightInset, gridBagConstraints);

        screenInitMenuBottomInset.setMinimumSize(new java.awt.Dimension(0, 0));
        screenInitMenuBottomInset.setOpaque(false);
        screenInitMenuBottomInset.setPreferredSize(new java.awt.Dimension(1280, 635));

        javax.swing.GroupLayout screenInitMenuBottomInsetLayout = new javax.swing.GroupLayout(screenInitMenuBottomInset);
        screenInitMenuBottomInset.setLayout(screenInitMenuBottomInsetLayout);
        screenInitMenuBottomInsetLayout.setHorizontalGroup(
            screenInitMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        screenInitMenuBottomInsetLayout.setVerticalGroup(
            screenInitMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8819;
        screenInitMenu.add(screenInitMenuBottomInset, gridBagConstraints);

        getContentPane().add(screenInitMenu);

        kitchenMenu.setOpaque(false);
        kitchenMenu.setPreferredSize(new java.awt.Dimension(1280, 720));
        kitchenMenu.setLayout(new java.awt.GridBagLayout());

        kitchenMenuTopInset.setMinimumSize(new java.awt.Dimension(0, 0));
        kitchenMenuTopInset.setOpaque(false);
        kitchenMenuTopInset.setPreferredSize(new java.awt.Dimension(1280, 150));

        javax.swing.GroupLayout kitchenMenuTopInsetLayout = new javax.swing.GroupLayout(kitchenMenuTopInset);
        kitchenMenuTopInset.setLayout(kitchenMenuTopInsetLayout);
        kitchenMenuTopInsetLayout.setHorizontalGroup(
            kitchenMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        kitchenMenuTopInsetLayout.setVerticalGroup(
            kitchenMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.20833;
        kitchenMenu.add(kitchenMenuTopInset, gridBagConstraints);

        kitchenMenuLeftInset.setMinimumSize(new java.awt.Dimension(0, 0));
        kitchenMenuLeftInset.setOpaque(false);
        kitchenMenuLeftInset.setPreferredSize(new java.awt.Dimension(490, 420));

        javax.swing.GroupLayout kitchenMenuLeftInsetLayout = new javax.swing.GroupLayout(kitchenMenuLeftInset);
        kitchenMenuLeftInset.setLayout(kitchenMenuLeftInsetLayout);
        kitchenMenuLeftInsetLayout.setHorizontalGroup(
            kitchenMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        kitchenMenuLeftInsetLayout.setVerticalGroup(
            kitchenMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3828;
        gridBagConstraints.weighty = 0.5833;
        kitchenMenu.add(kitchenMenuLeftInset, gridBagConstraints);

        kitchenMenuTimerText.setBackground(new java.awt.Color(0, 0, 0));
        kitchenMenuTimerText.setFont(new java.awt.Font("DS-Digital", 1, 60)); // NOI18N
        kitchenMenuTimerText.setForeground(new java.awt.Color(255, 255, 255));
        kitchenMenuTimerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kitchenMenuTimerText.setMaximumSize(new java.awt.Dimension(30000, 30000));
        kitchenMenuTimerText.setMinimumSize(new java.awt.Dimension(0, 0));
        kitchenMenuTimerText.setOpaque(true);
        kitchenMenuTimerText.setPreferredSize(new java.awt.Dimension(300, 84));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2344;
        gridBagConstraints.weighty = 0.1167;
        kitchenMenu.add(kitchenMenuTimerText, gridBagConstraints);

        kitchenMenuRightInset.setMinimumSize(new java.awt.Dimension(0, 0));
        kitchenMenuRightInset.setOpaque(false);
        kitchenMenuRightInset.setPreferredSize(new java.awt.Dimension(490, 420));

        javax.swing.GroupLayout kitchenMenuRightInsetLayout = new javax.swing.GroupLayout(kitchenMenuRightInset);
        kitchenMenuRightInset.setLayout(kitchenMenuRightInsetLayout);
        kitchenMenuRightInsetLayout.setHorizontalGroup(
            kitchenMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        kitchenMenuRightInsetLayout.setVerticalGroup(
            kitchenMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3828;
        gridBagConstraints.weighty = 0.5833;
        kitchenMenu.add(kitchenMenuRightInset, gridBagConstraints);

        oneSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        oneSec.setText("1");
        oneSec.setMaximumSize(new java.awt.Dimension(3000, 3000));
        oneSec.setMinimumSize(new java.awt.Dimension(0, 0));
        oneSec.setPreferredSize(new java.awt.Dimension(100, 84));
        oneSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oneSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.1167;
        kitchenMenu.add(oneSec, gridBagConstraints);

        twoSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        twoSec.setText("2");
        twoSec.setMaximumSize(new java.awt.Dimension(30000, 30000));
        twoSec.setMinimumSize(new java.awt.Dimension(0, 0));
        twoSec.setPreferredSize(new java.awt.Dimension(100, 84));
        twoSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twoSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(twoSec, gridBagConstraints);

        threeSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        threeSec.setText("3");
        threeSec.setMaximumSize(new java.awt.Dimension(3000, 3000));
        threeSec.setMinimumSize(new java.awt.Dimension(0, 0));
        threeSec.setPreferredSize(new java.awt.Dimension(100, 84));
        threeSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                threeSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(threeSec, gridBagConstraints);

        fourSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        fourSec.setText("4");
        fourSec.setMaximumSize(new java.awt.Dimension(30000, 30000));
        fourSec.setMinimumSize(new java.awt.Dimension(0, 0));
        fourSec.setPreferredSize(new java.awt.Dimension(100, 84));
        fourSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fourSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(fourSec, gridBagConstraints);

        fiveSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        fiveSec.setText("5");
        fiveSec.setMaximumSize(new java.awt.Dimension(3000, 3000));
        fiveSec.setMinimumSize(new java.awt.Dimension(0, 0));
        fiveSec.setPreferredSize(new java.awt.Dimension(100, 84));
        fiveSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fiveSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(fiveSec, gridBagConstraints);

        sixSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        sixSec.setText("6");
        sixSec.setMaximumSize(new java.awt.Dimension(30000, 30000));
        sixSec.setMinimumSize(new java.awt.Dimension(0, 0));
        sixSec.setPreferredSize(new java.awt.Dimension(100, 84));
        sixSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sixSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(sixSec, gridBagConstraints);

        sevenSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        sevenSec.setText("7");
        sevenSec.setMaximumSize(new java.awt.Dimension(30000, 30000));
        sevenSec.setMinimumSize(new java.awt.Dimension(0, 0));
        sevenSec.setPreferredSize(new java.awt.Dimension(100, 84));
        sevenSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sevenSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(sevenSec, gridBagConstraints);

        eightSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        eightSec.setText("8");
        eightSec.setMaximumSize(new java.awt.Dimension(30000, 30000));
        eightSec.setMinimumSize(new java.awt.Dimension(0, 0));
        eightSec.setPreferredSize(new java.awt.Dimension(100, 84));
        eightSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eightSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(eightSec, gridBagConstraints);

        nineSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        nineSec.setText("9");
        nineSec.setMaximumSize(new java.awt.Dimension(30000, 30000));
        nineSec.setMinimumSize(new java.awt.Dimension(0, 0));
        nineSec.setPreferredSize(new java.awt.Dimension(100, 84));
        nineSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nineSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(nineSec, gridBagConstraints);

        tenSec.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        tenSec.setText("0");
        tenSec.setMaximumSize(new java.awt.Dimension(30000, 30000));
        tenSec.setMinimumSize(new java.awt.Dimension(0, 0));
        tenSec.setPreferredSize(new java.awt.Dimension(100, 84));
        tenSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tenSecMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.078125;
        gridBagConstraints.weighty = 0.116667;
        kitchenMenu.add(tenSec, gridBagConstraints);

        startButton.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        startButton.setText("start");
        startButton.setMaximumSize(new java.awt.Dimension(3000, 3000));
        startButton.setMinimumSize(new java.awt.Dimension(0, 0));
        startButton.setPreferredSize(new java.awt.Dimension(200, 84));
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButtonMouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.15625;
        gridBagConstraints.weighty = 0.11667;
        kitchenMenu.add(startButton, gridBagConstraints);

        kitchenMenuBottomInset.setMinimumSize(new java.awt.Dimension(0, 0));
        kitchenMenuBottomInset.setOpaque(false);
        kitchenMenuBottomInset.setPreferredSize(new java.awt.Dimension(1280, 150));

        javax.swing.GroupLayout kitchenMenuBottomInsetLayout = new javax.swing.GroupLayout(kitchenMenuBottomInset);
        kitchenMenuBottomInset.setLayout(kitchenMenuBottomInsetLayout);
        kitchenMenuBottomInsetLayout.setHorizontalGroup(
            kitchenMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        kitchenMenuBottomInsetLayout.setVerticalGroup(
            kitchenMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.20833;
        kitchenMenu.add(kitchenMenuBottomInset, gridBagConstraints);

        getContentPane().add(kitchenMenu);

        bedroomMenu.setOpaque(false);
        bedroomMenu.setLayout(new java.awt.GridBagLayout());

        bedroomMenuTopInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bedroomMenuTopInset.setOpaque(false);
        bedroomMenuTopInset.setPreferredSize(new java.awt.Dimension(1280, 150));

        javax.swing.GroupLayout bedroomMenuTopInsetLayout = new javax.swing.GroupLayout(bedroomMenuTopInset);
        bedroomMenuTopInset.setLayout(bedroomMenuTopInsetLayout);
        bedroomMenuTopInsetLayout.setHorizontalGroup(
            bedroomMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bedroomMenuTopInsetLayout.setVerticalGroup(
            bedroomMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.20833;
        bedroomMenu.add(bedroomMenuTopInset, gridBagConstraints);

        bedroomMenuLeftInset.setOpaque(false);
        bedroomMenuLeftInset.setPreferredSize(new java.awt.Dimension(320, 420));

        javax.swing.GroupLayout bedroomMenuLeftInsetLayout = new javax.swing.GroupLayout(bedroomMenuLeftInset);
        bedroomMenuLeftInset.setLayout(bedroomMenuLeftInsetLayout);
        bedroomMenuLeftInsetLayout.setHorizontalGroup(
            bedroomMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bedroomMenuLeftInsetLayout.setVerticalGroup(
            bedroomMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.5833;
        bedroomMenu.add(bedroomMenuLeftInset, gridBagConstraints);

        alarmClockDisplay.setBackground(new java.awt.Color(0, 0, 0));
        alarmClockDisplay.setMinimumSize(new java.awt.Dimension(0, 0));
        alarmClockDisplay.setPreferredSize(new java.awt.Dimension(640, 200));
        alarmClockDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alarmClockDisplayMouseEntered(evt);
            }
        });
        alarmClockDisplay.setLayout(new java.awt.BorderLayout());

        alarmClockText.setFont(new java.awt.Font("DS-Digital", 0, 120)); // NOI18N
        alarmClockText.setForeground(new java.awt.Color(255, 102, 102));
        alarmClockText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alarmClockText.setText("00:00 AM");
        alarmClockDisplay.add(alarmClockText, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.27778;
        bedroomMenu.add(alarmClockDisplay, gridBagConstraints);

        bedroomMenuRightInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bedroomMenuRightInset.setOpaque(false);
        bedroomMenuRightInset.setPreferredSize(new java.awt.Dimension(320, 420));

        javax.swing.GroupLayout bedroomMenuRightInsetLayout = new javax.swing.GroupLayout(bedroomMenuRightInset);
        bedroomMenuRightInset.setLayout(bedroomMenuRightInsetLayout);
        bedroomMenuRightInsetLayout.setHorizontalGroup(
            bedroomMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bedroomMenuRightInsetLayout.setVerticalGroup(
            bedroomMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.5833;
        bedroomMenu.add(bedroomMenuRightInset, gridBagConstraints);

        bedroomMenuMiddleInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bedroomMenuMiddleInset.setOpaque(false);
        bedroomMenuMiddleInset.setPreferredSize(new java.awt.Dimension(640, 120));

        javax.swing.GroupLayout bedroomMenuMiddleInsetLayout = new javax.swing.GroupLayout(bedroomMenuMiddleInset);
        bedroomMenuMiddleInset.setLayout(bedroomMenuMiddleInsetLayout);
        bedroomMenuMiddleInsetLayout.setHorizontalGroup(
            bedroomMenuMiddleInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bedroomMenuMiddleInsetLayout.setVerticalGroup(
            bedroomMenuMiddleInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1667;
        bedroomMenu.add(bedroomMenuMiddleInset, gridBagConstraints);

        hourComboBox.setFont(new java.awt.Font("Tahoma", 0, 64)); // NOI18N
        hourComboBox.setMinimumSize(new java.awt.Dimension(0, 0));
        hourComboBox.setPreferredSize(new java.awt.Dimension(128, 100));
        hourComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.13889;
        bedroomMenu.add(hourComboBox, gridBagConstraints);

        hourInset.setMinimumSize(new java.awt.Dimension(0, 0));
        hourInset.setOpaque(false);
        hourInset.setPreferredSize(new java.awt.Dimension(128, 100));

        javax.swing.GroupLayout hourInsetLayout = new javax.swing.GroupLayout(hourInset);
        hourInset.setLayout(hourInsetLayout);
        hourInsetLayout.setHorizontalGroup(
            hourInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hourInsetLayout.setVerticalGroup(
            hourInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.13889;
        bedroomMenu.add(hourInset, gridBagConstraints);

        minuteComboBox.setFont(new java.awt.Font("Tahoma", 0, 64)); // NOI18N
        minuteComboBox.setMinimumSize(new java.awt.Dimension(0, 0));
        minuteComboBox.setPreferredSize(new java.awt.Dimension(128, 100));
        minuteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuteComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.13889;
        bedroomMenu.add(minuteComboBox, gridBagConstraints);

        minuteInset.setMinimumSize(new java.awt.Dimension(0, 0));
        minuteInset.setOpaque(false);
        minuteInset.setPreferredSize(new java.awt.Dimension(128, 100));

        javax.swing.GroupLayout minuteInsetLayout = new javax.swing.GroupLayout(minuteInset);
        minuteInset.setLayout(minuteInsetLayout);
        minuteInsetLayout.setHorizontalGroup(
            minuteInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        minuteInsetLayout.setVerticalGroup(
            minuteInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.13889;
        bedroomMenu.add(minuteInset, gridBagConstraints);

        dayHalfComboBox.setFont(new java.awt.Font("Tahoma", 0, 64)); // NOI18N
        dayHalfComboBox.setMinimumSize(new java.awt.Dimension(0, 0));
        dayHalfComboBox.setPreferredSize(new java.awt.Dimension(128, 100));
        dayHalfComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayHalfComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.13889;
        bedroomMenu.add(dayHalfComboBox, gridBagConstraints);

        bedroomMenuBottomInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bedroomMenuBottomInset.setOpaque(false);
        bedroomMenuBottomInset.setPreferredSize(new java.awt.Dimension(1280, 150));

        javax.swing.GroupLayout bedroomMenuBottomInsetLayout = new javax.swing.GroupLayout(bedroomMenuBottomInset);
        bedroomMenuBottomInset.setLayout(bedroomMenuBottomInsetLayout);
        bedroomMenuBottomInsetLayout.setHorizontalGroup(
            bedroomMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bedroomMenuBottomInsetLayout.setVerticalGroup(
            bedroomMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.20833;
        bedroomMenu.add(bedroomMenuBottomInset, gridBagConstraints);

        getContentPane().add(bedroomMenu);

        bathroomMenu.setOpaque(false);
        bathroomMenu.setLayout(new java.awt.GridBagLayout());

        bathroomMenuTopInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bathroomMenuTopInset.setOpaque(false);
        bathroomMenuTopInset.setPreferredSize(new java.awt.Dimension(1280, 110));

        javax.swing.GroupLayout bathroomMenuTopInsetLayout = new javax.swing.GroupLayout(bathroomMenuTopInset);
        bathroomMenuTopInset.setLayout(bathroomMenuTopInsetLayout);
        bathroomMenuTopInsetLayout.setHorizontalGroup(
            bathroomMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bathroomMenuTopInsetLayout.setVerticalGroup(
            bathroomMenuTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.15278;
        bathroomMenu.add(bathroomMenuTopInset, gridBagConstraints);

        bathroomMenuLeftInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bathroomMenuLeftInset.setOpaque(false);
        bathroomMenuLeftInset.setPreferredSize(new java.awt.Dimension(390, 500));

        javax.swing.GroupLayout bathroomMenuLeftInsetLayout = new javax.swing.GroupLayout(bathroomMenuLeftInset);
        bathroomMenuLeftInset.setLayout(bathroomMenuLeftInsetLayout);
        bathroomMenuLeftInsetLayout.setHorizontalGroup(
            bathroomMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bathroomMenuLeftInsetLayout.setVerticalGroup(
            bathroomMenuLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3047;
        gridBagConstraints.weighty = 0.6944;
        bathroomMenu.add(bathroomMenuLeftInset, gridBagConstraints);

        bathroomMenuImage.setMinimumSize(new java.awt.Dimension(0, 0));
        bathroomMenuImage.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout bathroomMenuImageLayout = new javax.swing.GroupLayout(bathroomMenuImage);
        bathroomMenuImage.setLayout(bathroomMenuImageLayout);
        bathroomMenuImageLayout.setHorizontalGroup(
            bathroomMenuImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bathroomMenuImageLayout.setVerticalGroup(
            bathroomMenuImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.39063;
        gridBagConstraints.weighty = 0.6944;
        bathroomMenu.add(bathroomMenuImage, gridBagConstraints);

        bathroomMenuRightInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bathroomMenuRightInset.setOpaque(false);
        bathroomMenuRightInset.setPreferredSize(new java.awt.Dimension(390, 500));

        javax.swing.GroupLayout bathroomMenuRightInsetLayout = new javax.swing.GroupLayout(bathroomMenuRightInset);
        bathroomMenuRightInset.setLayout(bathroomMenuRightInsetLayout);
        bathroomMenuRightInsetLayout.setHorizontalGroup(
            bathroomMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bathroomMenuRightInsetLayout.setVerticalGroup(
            bathroomMenuRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3047;
        gridBagConstraints.weighty = 0.6944;
        bathroomMenu.add(bathroomMenuRightInset, gridBagConstraints);

        bathroomMenuBottomInset.setMinimumSize(new java.awt.Dimension(0, 0));
        bathroomMenuBottomInset.setOpaque(false);
        bathroomMenuBottomInset.setPreferredSize(new java.awt.Dimension(1280, 110));

        javax.swing.GroupLayout bathroomMenuBottomInsetLayout = new javax.swing.GroupLayout(bathroomMenuBottomInset);
        bathroomMenuBottomInset.setLayout(bathroomMenuBottomInsetLayout);
        bathroomMenuBottomInsetLayout.setHorizontalGroup(
            bathroomMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bathroomMenuBottomInsetLayout.setVerticalGroup(
            bathroomMenuBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.15278;
        bathroomMenu.add(bathroomMenuBottomInset, gridBagConstraints);

        getContentPane().add(bathroomMenu);

        clockPanel.setOpaque(false);
        clockPanel.setLayout(new java.awt.GridBagLayout());

        clockPanelTopInset.setMinimumSize(new java.awt.Dimension(0, 0));
        clockPanelTopInset.setOpaque(false);
        clockPanelTopInset.setPreferredSize(new java.awt.Dimension(1280, 10));

        javax.swing.GroupLayout clockPanelTopInsetLayout = new javax.swing.GroupLayout(clockPanelTopInset);
        clockPanelTopInset.setLayout(clockPanelTopInsetLayout);
        clockPanelTopInsetLayout.setHorizontalGroup(
            clockPanelTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clockPanelTopInsetLayout.setVerticalGroup(
            clockPanelTopInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.013889;
        clockPanel.add(clockPanelTopInset, gridBagConstraints);

        clockPanelLeftInset.setMinimumSize(new java.awt.Dimension(0, 0));
        clockPanelLeftInset.setOpaque(false);
        clockPanelLeftInset.setPreferredSize(new java.awt.Dimension(670, 75));

        javax.swing.GroupLayout clockPanelLeftInsetLayout = new javax.swing.GroupLayout(clockPanelLeftInset);
        clockPanelLeftInset.setLayout(clockPanelLeftInsetLayout);
        clockPanelLeftInsetLayout.setHorizontalGroup(
            clockPanelLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clockPanelLeftInsetLayout.setVerticalGroup(
            clockPanelLeftInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5234;
        gridBagConstraints.weighty = 0.104167;
        clockPanel.add(clockPanelLeftInset, gridBagConstraints);

        clockThread.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clockThread.setMinimumSize(new java.awt.Dimension(0, 0));
        clockThread.setOpaque(false);
        clockThread.setPreferredSize(new java.awt.Dimension(600, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.46875;
        gridBagConstraints.weighty = 0.104167;
        clockPanel.add(clockThread, gridBagConstraints);

        clockPanelRightInset.setMinimumSize(new java.awt.Dimension(0, 0));
        clockPanelRightInset.setOpaque(false);
        clockPanelRightInset.setPreferredSize(new java.awt.Dimension(10, 75));

        javax.swing.GroupLayout clockPanelRightInsetLayout = new javax.swing.GroupLayout(clockPanelRightInset);
        clockPanelRightInset.setLayout(clockPanelRightInsetLayout);
        clockPanelRightInsetLayout.setHorizontalGroup(
            clockPanelRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clockPanelRightInsetLayout.setVerticalGroup(
            clockPanelRightInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.0078125;
        gridBagConstraints.weighty = 0.10416667;
        clockPanel.add(clockPanelRightInset, gridBagConstraints);

        clockPanelBottomInset.setMinimumSize(new java.awt.Dimension(0, 0));
        clockPanelBottomInset.setOpaque(false);
        clockPanelBottomInset.setPreferredSize(new java.awt.Dimension(1280, 635));

        javax.swing.GroupLayout clockPanelBottomInsetLayout = new javax.swing.GroupLayout(clockPanelBottomInset);
        clockPanelBottomInset.setLayout(clockPanelBottomInsetLayout);
        clockPanelBottomInsetLayout.setHorizontalGroup(
            clockPanelBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        clockPanelBottomInsetLayout.setVerticalGroup(
            clockPanelBottomInsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.881944;
        clockPanel.add(clockPanelBottomInset, gridBagConstraints);

        getContentPane().add(clockPanel);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(background);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        screenInitMenu.setVisible(false);
        screenInitMenu.setEnabled(false);
        screenSelectionMenu.setVisible(true);
        screenSelectionMenu.setVisible(true);
    }//GEN-LAST:event_homeButtonMouseEntered

    private void screenSelectionMenuRightInsetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenSelectionMenuRightInsetMouseEntered
        if(screenSelectionMenu.isVisible()) {
            screenSelectionMenu.setVisible(false);
            screenSelectionMenu.setEnabled(false);
            screenInitMenu.setVisible(true);
            screenInitMenu.setEnabled(true);
        }
    }//GEN-LAST:event_screenSelectionMenuRightInsetMouseEntered

    private void oneSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "1");
    }//GEN-LAST:event_oneSecMouseEntered

    private void twoSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "2");
    }//GEN-LAST:event_twoSecMouseEntered

    private void threeSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "3");
    }//GEN-LAST:event_threeSecMouseEntered

    private void fourSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "4");
    }//GEN-LAST:event_fourSecMouseEntered

    private void fiveSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "5");
    }//GEN-LAST:event_fiveSecMouseEntered

    private void sixSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "6");
    }//GEN-LAST:event_sixSecMouseEntered

    private void sevenSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "7");
    }//GEN-LAST:event_sevenSecMouseEntered

    private void eightSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "8");
    }//GEN-LAST:event_eightSecMouseEntered

    private void nineSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "9");
    }//GEN-LAST:event_nineSecMouseEntered

    private void tenSecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenSecMouseEntered
        if(!timer.isRunning())
            kitchenMenuTimerText.setText(kitchenMenuTimerText.getText() + "0");
    }//GEN-LAST:event_tenSecMouseEntered

    private void startButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseEntered
        if(!timer.isRunning()) {
            timerLength = Integer.parseInt(kitchenMenuTimerText.getText());
            timer.start();
        }
    }//GEN-LAST:event_startButtonMouseEntered

    private void kitchenButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitchenButtonMouseEntered
        screenSelectionMenu.setVisible(false);
        screenSelectionMenu.setEnabled(false);
        screenInitMenu.setVisible(true);
        screenInitMenu.setEnabled(true);
        kitchenMenu.setVisible(true);
        kitchenMenu.setEnabled(true);
        bathroomMenu.setVisible(false);
        bathroomMenu.setEnabled(false);
        bedroomMenu.setVisible(false);
        bedroomMenu.setEnabled(false);
        
        if(timer2.isRunning())
            timer2.stop();
        if(timer3.isRunning())
            timer3.stop();
    }//GEN-LAST:event_kitchenButtonMouseEntered

    private void bedroomButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bedroomButtonMouseEntered
        screenSelectionMenu.setVisible(false);
        screenSelectionMenu.setEnabled(false);
        screenInitMenu.setVisible(true);
        screenInitMenu.setEnabled(true);
        kitchenMenu.setVisible(false);
        kitchenMenu.setEnabled(false);
        bathroomMenu.setVisible(false);
        bathroomMenu.setEnabled(false);
        bedroomMenu.setVisible(true);
        bedroomMenu.setEnabled(true);
        
        timer2.start();
        
        if(timer3.isRunning())
            timer3.stop();
    }//GEN-LAST:event_bedroomButtonMouseEntered

    private void bathroomButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bathroomButtonMouseEntered
        screenSelectionMenu.setVisible(false);
        screenSelectionMenu.setEnabled(false);
        screenInitMenu.setVisible(true);
        screenInitMenu.setEnabled(true);
        kitchenMenu.setVisible(false);
        kitchenMenu.setEnabled(false);
        bathroomMenu.setVisible(true);
        bathroomMenu.setEnabled(true);
        bedroomMenu.setVisible(false);
        bedroomMenu.setEnabled(false);
        
        timer3.start();
        
        if(timer2.isRunning())
            timer2.stop();
    }//GEN-LAST:event_bathroomButtonMouseEntered

    private void hourComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourComboBoxActionPerformed
        updateAlarmText();
    }//GEN-LAST:event_hourComboBoxActionPerformed

    private void minuteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuteComboBoxActionPerformed
        updateAlarmText();
    }//GEN-LAST:event_minuteComboBoxActionPerformed

    private void dayHalfComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayHalfComboBoxActionPerformed
        updateAlarmText();
    }//GEN-LAST:event_dayHalfComboBoxActionPerformed

    private void alarmClockDisplayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alarmClockDisplayMouseEntered
        if(alarm.isRunning())
            alarm.stop();
    }//GEN-LAST:event_alarmClockDisplayMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alarmClockDisplay;
    private javax.swing.JLabel alarmClockText;
    private homeentertainmentautomation.customcomponents.JImagePanel background;
    private javax.swing.JButton bathroomButton;
    private javax.swing.JPanel bathroomMenu;
    private javax.swing.JPanel bathroomMenuBottomInset;
    private homeentertainmentautomation.customcomponents.JImagePanel bathroomMenuImage;
    private javax.swing.JPanel bathroomMenuLeftInset;
    private javax.swing.JPanel bathroomMenuRightInset;
    private javax.swing.JPanel bathroomMenuTopInset;
    private javax.swing.JButton bedroomButton;
    private javax.swing.JPanel bedroomMenu;
    private javax.swing.JPanel bedroomMenuBottomInset;
    private javax.swing.JPanel bedroomMenuLeftInset;
    private javax.swing.JPanel bedroomMenuMiddleInset;
    private javax.swing.JPanel bedroomMenuRightInset;
    private javax.swing.JPanel bedroomMenuTopInset;
    private javax.swing.JPanel clockPanel;
    private javax.swing.JPanel clockPanelBottomInset;
    private javax.swing.JPanel clockPanelLeftInset;
    private javax.swing.JPanel clockPanelRightInset;
    private javax.swing.JPanel clockPanelTopInset;
    private homeentertainmentautomation.customcomponents.JDatePanel clockThread;
    private javax.swing.JComboBox<String> dayHalfComboBox;
    private javax.swing.JButton eightSec;
    private javax.swing.JButton fiveSec;
    private javax.swing.JButton fourSec;
    private homeentertainmentautomation.customcomponents.JImagePanel homeButton;
    private javax.swing.JComboBox<String> hourComboBox;
    private javax.swing.JPanel hourInset;
    private javax.swing.JButton kitchenButton;
    private javax.swing.JPanel kitchenMenu;
    private javax.swing.JPanel kitchenMenuBottomInset;
    private javax.swing.JPanel kitchenMenuLeftInset;
    private javax.swing.JPanel kitchenMenuRightInset;
    private javax.swing.JLabel kitchenMenuTimerText;
    private javax.swing.JPanel kitchenMenuTopInset;
    private javax.swing.JComboBox<String> minuteComboBox;
    private javax.swing.JPanel minuteInset;
    private javax.swing.JButton nineSec;
    private javax.swing.JButton oneSec;
    private javax.swing.JPanel screenInitMenu;
    private javax.swing.JPanel screenInitMenuBottomInset;
    private javax.swing.JPanel screenInitMenuLeftInset;
    private javax.swing.JPanel screenInitMenuRightInset;
    private javax.swing.JPanel screenInitMenuTopInset;
    private javax.swing.JPanel screenSelectionMenu;
    private javax.swing.JPanel screenSelectionMenuRightInset;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JPanel selectionPanelBottomInset;
    private javax.swing.JPanel selectionPanelLeftInset;
    private javax.swing.JPanel selectionPanelMiddleInset1;
    private javax.swing.JPanel selectionPanelMiddleInset3;
    private javax.swing.JPanel selectionPanelRightInset;
    private javax.swing.JPanel selectionPanelTopInset;
    private javax.swing.JButton sevenSec;
    private javax.swing.JButton sixSec;
    private javax.swing.JButton startButton;
    private javax.swing.JButton tenSec;
    private javax.swing.JButton threeSec;
    private javax.swing.JButton twoSec;
    // End of variables declaration//GEN-END:variables
}
