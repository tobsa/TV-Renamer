package gui;

import domain.Episode;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ListEpisodeCellRenderer implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Episode episode = (Episode)value;
        
        JLabel label = new JLabel(episode.getName());
        label.setOpaque(true);
        label.setBackground(new Color(127,255,0,100));
        
        if(!episode.getName().isEmpty())
            label.setBorder(new EmptyBorder(2, 10, 2, 10));
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label);
        panel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5,5,5,5), new TitledBorder("Episode " + episode.getNumber() + " - " + episode.getOriginalName())));
        
        if(isSelected)
            panel.setBackground(new Color(51, 153, 255));
        
        return panel;
    }
    
}
