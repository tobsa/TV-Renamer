package gui;

import domain.Episode;
import domain.EpisodeManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.prefs.Preferences;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame extends JFrame {
    private EpisodeManager episodeManager = new EpisodeManager();
    
    public MainFrame() {
        initComponents();
        
        listFullEpisodeNames.setCellRenderer(new ListEpisodeCellRenderer());
    }
    
    private void updateList() {
        DefaultListModel<Episode> model = new DefaultListModel();
        for(Episode episode : episodeManager.getEpisodes())
            model.addElement(episode);
        listFullEpisodeNames.setModel(model);
        
        DefaultListModel<String> modelEpisodeTitles = new DefaultListModel();
        for(String name : episodeManager.getEpisodeTitles())
            modelEpisodeTitles.addElement(name);
        listEpisodeTitles.setModel(modelEpisodeTitles);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFullEpisodeNames = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listFullEpisodeNames = new javax.swing.JList<Episode>();
        panelEpisodeTitles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEpisodeTitles = new javax.swing.JList<String>();
        panelEpisodeFormat = new javax.swing.JPanel();
        textfieldEpisodeFormat = new javax.swing.JTextField();
        buttonUpdate = new javax.swing.JButton();
        panelIMDBLink = new javax.swing.JPanel();
        textfieldIMDBLink = new javax.swing.JTextField();
        buttonFetch = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonMoveUp = new javax.swing.JButton();
        buttonMoveDown = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonRemoveEpisode = new javax.swing.JButton();
        buttonChooseFiles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TVRenamer");

        panelFullEpisodeNames.setBorder(javax.swing.BorderFactory.createTitledBorder("Full Episode Names"));

        listFullEpisodeNames.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listFullEpisodeNamesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listFullEpisodeNames);

        javax.swing.GroupLayout panelFullEpisodeNamesLayout = new javax.swing.GroupLayout(panelFullEpisodeNames);
        panelFullEpisodeNames.setLayout(panelFullEpisodeNamesLayout);
        panelFullEpisodeNamesLayout.setHorizontalGroup(
            panelFullEpisodeNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFullEpisodeNamesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFullEpisodeNamesLayout.setVerticalGroup(
            panelFullEpisodeNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFullEpisodeNamesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEpisodeTitles.setBorder(javax.swing.BorderFactory.createTitledBorder("Episode Titles"));

        listEpisodeTitles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listEpisodeTitles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEpisodeTitlesMouseClicked(evt);
            }
        });
        listEpisodeTitles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEpisodeTitlesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listEpisodeTitles);

        javax.swing.GroupLayout panelEpisodeTitlesLayout = new javax.swing.GroupLayout(panelEpisodeTitles);
        panelEpisodeTitles.setLayout(panelEpisodeTitlesLayout);
        panelEpisodeTitlesLayout.setHorizontalGroup(
            panelEpisodeTitlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEpisodeTitlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelEpisodeTitlesLayout.setVerticalGroup(
            panelEpisodeTitlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEpisodeTitlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEpisodeFormat.setBorder(javax.swing.BorderFactory.createTitledBorder("Episode Format"));

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEpisodeFormatLayout = new javax.swing.GroupLayout(panelEpisodeFormat);
        panelEpisodeFormat.setLayout(panelEpisodeFormatLayout);
        panelEpisodeFormatLayout.setHorizontalGroup(
            panelEpisodeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEpisodeFormatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfieldEpisodeFormat, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEpisodeFormatLayout.setVerticalGroup(
            panelEpisodeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEpisodeFormatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEpisodeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldEpisodeFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdate))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelIMDBLink.setBorder(javax.swing.BorderFactory.createTitledBorder("IMDB Link"));

        buttonFetch.setText("Fetch");
        buttonFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIMDBLinkLayout = new javax.swing.GroupLayout(panelIMDBLink);
        panelIMDBLink.setLayout(panelIMDBLinkLayout);
        panelIMDBLinkLayout.setHorizontalGroup(
            panelIMDBLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIMDBLinkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfieldIMDBLink, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonFetch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelIMDBLinkLayout.setVerticalGroup(
            panelIMDBLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIMDBLinkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIMDBLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldIMDBLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFetch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonExit.setText("Exit");
        buttonExit.setToolTipText("");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonMoveUp.setText("Move Up");
        buttonMoveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoveUpActionPerformed(evt);
            }
        });

        buttonMoveDown.setText("Move Down");
        buttonMoveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoveDownActionPerformed(evt);
            }
        });

        buttonRemove.setText("Remove");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonRemoveEpisode.setText("Remove");
        buttonRemoveEpisode.setToolTipText("");
        buttonRemoveEpisode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveEpisodeActionPerformed(evt);
            }
        });

        buttonChooseFiles.setText("Choose Files...");
        buttonChooseFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChooseFilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelEpisodeFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(121, 121, 121)
                            .addComponent(buttonRemoveEpisode, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(121, 121, 121)
                            .addComponent(buttonChooseFiles)))
                    .addComponent(panelFullEpisodeNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonMoveDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMoveUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelIMDBLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEpisodeTitles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEpisodeFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIMDBLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFullEpisodeNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonExit)
                                .addComponent(buttonRemoveEpisode))
                            .addComponent(buttonChooseFiles)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEpisodeTitles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSave)
                            .addComponent(buttonEdit)
                            .addComponent(buttonRemove)
                            .addComponent(buttonAdd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(buttonMoveUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMoveDown)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFetchActionPerformed
        try {
            URL url = new URL(textfieldIMDBLink.getText());
            URLConnection connection = url.openConnection();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String input;
                episodeManager.clearEpisodeTitles();
                while((input = reader.readLine()) != null) {
                    if(input.contains("?ref_=ttep_ep") && input.contains("itemprop=\"url\"")) {
                        input = input.substring(input.indexOf("\"") + 1);
                        input = input.substring(input.indexOf("\"") + 1);
                        input = input.substring(input.indexOf("\"") + 1);
                        input = input.substring(0, input.indexOf("\""));
                        input = input.replaceAll(" ", ".");
                        input = input.replaceAll(",", ".");
                        input = input.replaceAll("-", ".");                        
                        episodeManager.addEpisodeTitle(input);
                    }
                }
                
                episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText()); 
                updateList();
            }
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(MainFrame.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(MainFrame.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonFetchActionPerformed

    private void buttonChooseFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChooseFilesActionPerformed
        Preferences prefs = Preferences.userRoot().node(getClass().getName());
                
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(prefs.get("LAST_USED_FOLDER", "")));
        fc.setMultiSelectionEnabled(true);
            
        FileFilter filter = new FileNameExtensionFilter("Video files", new String[] {"Avi", "mkv", "wmv"});
        fc.addChoosableFileFilter(filter);
        fc.setFileFilter(filter);
                
        if(fc.showOpenDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION) {
           episodeManager.addEpisodes(fc.getSelectedFiles());
           episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
           episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText()); 
           updateList();
           
           prefs.put("LAST_USED_FOLDER", fc.getCurrentDirectory().getAbsolutePath());
        }
    }//GEN-LAST:event_buttonChooseFilesActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
        updateList();
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        int index = listEpisodeTitles.getSelectedIndex();
        if(index == -1)
            return;
        
        episodeManager.removeEpisodeTitle(index);
        
        episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText()); 
        updateList();
    }//GEN-LAST:event_buttonRemoveActionPerformed

    private void buttonMoveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoveUpActionPerformed
        if(listFullEpisodeNames.getSelectedIndex() != -1) {
            int index = listFullEpisodeNames.getSelectedIndex();

            if(index > 0) {
                episodeManager.swapEpisodes(index, index - 1);
                episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
                updateList();
                listFullEpisodeNames.setSelectedIndex(index - 1);
            }
        } else if(listEpisodeTitles.getSelectedIndex() != -1) {
            int index = listEpisodeTitles.getSelectedIndex();
            
            if(index > 0) {
                episodeManager.swapEpisodeTitles(index, index - 1);
                episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
                updateList();
                listEpisodeTitles.setSelectedIndex(index - 1);
            }
        }
        
    }//GEN-LAST:event_buttonMoveUpActionPerformed
       
    private void buttonMoveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoveDownActionPerformed
        if(listFullEpisodeNames.getSelectedIndex() != -1) {
            int index = listFullEpisodeNames.getSelectedIndex();
            if(index == -1)
                return;

            if(index < episodeManager.getNumEpisodes() - 1) {
                episodeManager.swapEpisodes(index, index + 1);
                episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
                updateList();
                listFullEpisodeNames.setSelectedIndex(index + 1);
            }
        } else if(listEpisodeTitles.getSelectedIndex() != -1) {
            int index = listEpisodeTitles.getSelectedIndex();
            
            if(index < episodeManager.getEpisodeTitles().size() - 1) {
                episodeManager.swapEpisodeTitles(index, index + 1);
                episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
                updateList();
                listEpisodeTitles.setSelectedIndex(index + 1);
            }
        }
    }//GEN-LAST:event_buttonMoveDownActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        int index = listEpisodeTitles.getSelectedIndex();
        if(index == -1)
            return;
        
        EpisodeEditDialog dialog = new EpisodeEditDialog(MainFrame.this, index, listEpisodeTitles.getSelectedValue(), episodeManager);
        episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
        updateList();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void listFullEpisodeNamesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listFullEpisodeNamesValueChanged
        listEpisodeTitles.clearSelection();
    }//GEN-LAST:event_listFullEpisodeNamesValueChanged

    private void listEpisodeTitlesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEpisodeTitlesValueChanged
        listFullEpisodeNames.clearSelection();
    }//GEN-LAST:event_listEpisodeTitlesValueChanged

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        AddEpisodeTitleDialog dialog = new AddEpisodeTitleDialog(MainFrame.this, episodeManager);
        episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());
        updateList();        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonRemoveEpisodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveEpisodeActionPerformed
        int[] indices = listFullEpisodeNames.getSelectedIndices();
        if(indices.length == 0)
            return;
        
        episodeManager.removeEpisode(indices);
        episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());
        updateList();   
    }//GEN-LAST:event_buttonRemoveEpisodeActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void listEpisodeTitlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEpisodeTitlesMouseClicked
        if(evt.getClickCount() == 2) {
            int index = listEpisodeTitles.getSelectedIndex();
            if(index == -1)
                return;

            EpisodeEditDialog dialog = new EpisodeEditDialog(MainFrame.this, index, listEpisodeTitles.getSelectedValue(), episodeManager);
            episodeManager.setEpisodeFormat(textfieldEpisodeFormat.getText());          
            updateList();
        }
    }//GEN-LAST:event_listEpisodeTitlesMouseClicked

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        episodeManager.renameAll();
    }//GEN-LAST:event_buttonSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonChooseFiles;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonFetch;
    private javax.swing.JButton buttonMoveDown;
    private javax.swing.JButton buttonMoveUp;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonRemoveEpisode;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listEpisodeTitles;
    private javax.swing.JList<Episode> listFullEpisodeNames;
    private javax.swing.JPanel panelEpisodeFormat;
    private javax.swing.JPanel panelEpisodeTitles;
    private javax.swing.JPanel panelFullEpisodeNames;
    private javax.swing.JPanel panelIMDBLink;
    private javax.swing.JTextField textfieldEpisodeFormat;
    private javax.swing.JTextField textfieldIMDBLink;
    // End of variables declaration//GEN-END:variables
}
