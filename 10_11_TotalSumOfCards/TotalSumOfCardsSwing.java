/*
* TotalSumOfCardsSwing.java
*
* This is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation v3.
*
* @see <a href="http://www.gnu.org/licenses/gpl.html">GNU License</a> for more information.
*
* Copyright (c) Joan Seculi <a href="mailto:joan.seculi@gmail.com">Joan Seculi</a>
*/
//package a10_11_totalSumOfCards;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * TotalSumOfCardsSwing.java - Two-player card game GUI.
 *
 * <p>Uses the student's {@code sumCards} and {@code checkResult} methods to
 * verify the exercise. The rest of the screen (card inputs, validation and
 * layout) is already complete.</p>
 */
public class TotalSumOfCardsSwing extends JFrame {

    private static final Color PRIMARY = new Color(185, 28, 28);
    private static final Color PRIMARY_DARK = new Color(153, 27, 27);
    private static final Color HEADER_START = new Color(30, 27, 75);
    private static final Color HEADER_END = new Color(159, 18, 57);
    private static final Color BG = new Color(248, 250, 252);
    private static final Color SURFACE = Color.WHITE;
    private static final Color BORDER = new Color(226, 232, 240);
    private static final Color INK = new Color(15, 23, 42);
    private static final Color MUTED = new Color(100, 116, 139);
    private static final Color FAINT = new Color(148, 163, 184);
    private static final Color DANGER = new Color(220, 38, 38);
    private static final Color WARNING = new Color(217, 119, 6);
    private static final Color PLAYER1 = new Color(37, 99, 235);
    private static final Color PLAYER2 = new Color(220, 38, 38);

    private final JTextField[] player1Fields = new JTextField[4];
    private final JTextField[] player2Fields = new JTextField[4];
    private final JLabel player1TotalLabel = new JLabel("Total: --");
    private final JLabel player2TotalLabel = new JLabel("Total: --");
    private final JLabel total1ResultLabel = new JLabel("Total cards Player 1: --");
    private final JLabel total2ResultLabel = new JLabel("Total cards Player 2: --");
    private final JLabel resultLabel = new JLabel("Waiting for cards...");
    private final JLabel errorLabel = new JLabel(" ");
    private final JButton calculateButton;
    private final JButton clearButton;

    /**
     * Suma els valors de les 4 cartes.
     */
    private int sumCards(int card1, int card2, int card3, int card4) {
		int suma = (card1+card2+card3+card4);      
        
        return suma;
    }

    /**
     * Retorna el missatge amb el guanyador o l'empat.
     */
    private String checkResult(int player1Total, int player2Total) {
		String res = "";
		if (player1Total > player2Total) {
            res = "Player 1 has won!";
        }
        else if (player2Total > player1Total) {
            res = "Player 2 has won!";
        }
        else {
            res = "It is a draw.";
        }
        
        return res;
    }

    
    public TotalSumOfCardsSwing() {
        calculateButton = createStyledButton("CHECK RESULTS", PRIMARY, Color.WHITE, false);
        clearButton = createStyledButton("CLEAR", PRIMARY_DARK, PRIMARY_DARK, true);

        setTitle("Total Sum of Cards \u00B7 10.11");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setMinimumSize(new Dimension(1000, 600));

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(BG);
        root.add(createHeaderPanel(), BorderLayout.NORTH);
        root.add(createBody(), BorderLayout.CENTER);

        setContentPane(root);
        setSize(1100, 640);
        setLocationRelativeTo(null);

        resetOutputs();
        SwingUtilities.invokeLater(() -> player1Fields[0].requestFocusInWindow());
    }

    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout(24, 0)) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setPaint(new GradientPaint(0, 0, HEADER_START, getWidth(), getHeight(), HEADER_END));
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.setColor(new Color(255, 255, 255, 16));
                g2.fillOval(getWidth() - 240, -90, 280, 280);
                g2.dispose();
            }
        };
        header.setOpaque(false);
        header.setBorder(new EmptyBorder(16, 28, 16, 28));

        JPanel texts = new JPanel();
        texts.setOpaque(false);
        texts.setLayout(new BoxLayout(texts, BoxLayout.Y_AXIS));

        JLabel badge = new JLabel("EXERCICI 10.11");
        badge.setFont(new Font("Segoe UI", Font.BOLD, 10));
        badge.setForeground(new Color(254, 226, 226));
        badge.setBorder(new CompoundBorder(
                new LineBorder(new Color(252, 165, 165, 130), 1, true),
                new EmptyBorder(3, 10, 3, 10)));
        badge.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel title = new JLabel("Total Sum of Cards");
        title.setFont(new Font("Segoe UI", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel(
                "Two players \u00B7 four cards each \u00B7 valid values from 1 to 12");
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        subtitle.setForeground(new Color(254, 226, 226));
        subtitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        texts.add(badge);
        texts.add(Box.createVerticalStrut(7));
        texts.add(title);
        texts.add(Box.createVerticalStrut(3));
        texts.add(subtitle);

        header.add(texts, BorderLayout.CENTER);
        header.add(new CardsBadge(), BorderLayout.EAST);

        return header;
    }

    private JComponent createBody() {
        JPanel body = new JPanel(new BorderLayout());
        body.setBackground(BG);
        body.setBorder(new EmptyBorder(18, 26, 22, 26));

        JPanel row = new JPanel(new GridBagLayout());
        row.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(0, 0, 0, 18);
        row.add(createPlayersPanel(), gbc);

        gbc.gridx = 1;
        gbc.weightx = 0;
        gbc.insets = new Insets(0, 0, 0, 0);
        row.add(createResultsCard(), gbc);

        body.add(row, BorderLayout.NORTH);

        wireEnterNavigation();
        return body;
    }

    private JPanel createPlayersPanel() {
        JPanel players = new JPanel(new GridLayout(1, 2, 18, 0));
        players.setOpaque(false);
        players.add(createPlayerCard(1, player1Fields, player1TotalLabel, PLAYER1));
        players.add(createPlayerCard(2, player2Fields, player2TotalLabel, PLAYER2));
        return players;
    }

    private JPanel createPlayerCard(int player, JTextField[] fields, JLabel totalLabel, Color color) {
        CardPanel card = new CardPanel();
        card.setLayout(new BorderLayout());
        card.setBorder(new EmptyBorder(18, 18, 18, 18));
        card.setPreferredSize(new Dimension(250, 400));

        JPanel content = new JPanel();
        content.setOpaque(false);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel titles = new JPanel();
        titles.setOpaque(false);
        titles.setLayout(new BoxLayout(titles, BoxLayout.Y_AXIS));

        JLabel tag = new JLabel("PLAYER " + player);
        tag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        tag.setForeground(color);
        tag.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel heading = new JLabel("Player " + player);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 18));
        heading.setForeground(INK);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel hint = new JLabel("Four cards \u00B7 values 1..12");
        hint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        hint.setForeground(MUTED);
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);

        titles.add(tag);
        titles.add(Box.createVerticalStrut(4));
        titles.add(heading);
        titles.add(Box.createVerticalStrut(2));
        titles.add(hint);
        content.add(titles);

        JPanel rows = new JPanel();
        rows.setOpaque(false);
        rows.setLayout(new BoxLayout(rows, BoxLayout.Y_AXIS));

        for (int i = 0; i < fields.length; i++) {
            fields[i] = createCardField();
            rows.add(createCardRow("Card " + (i + 1), fields[i]));
            if (i < fields.length - 1) {
                rows.add(Box.createVerticalStrut(10));
            }
        }
        int rowsHeight = fields.length * 38 + (fields.length - 1) * 10;
        rows.setMinimumSize(new Dimension(0, rowsHeight));
        rows.setPreferredSize(new Dimension(0, rowsHeight));
        rows.setMaximumSize(new Dimension(Integer.MAX_VALUE, rowsHeight));
        content.add(Box.createVerticalStrut(12));
        content.add(rows);
        content.add(Box.createVerticalStrut(12));

        totalLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        totalLabel.setForeground(color);
        totalLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        totalLabel.setBorder(new EmptyBorder(4, 0, 0, 0));
        content.add(totalLabel);
        content.add(Box.createVerticalStrut(10));

        JSeparator separator = new JSeparator();
        separator.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
        separator.setForeground(BORDER);
        content.add(separator);
        content.add(Box.createVerticalStrut(10));

        JLabel footer = new JLabel(
                "<html>Enter four values from 1 to 12.<br>The total is calculated automatically.</html>");
        footer.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        footer.setForeground(FAINT);
        footer.setAlignmentX(Component.LEFT_ALIGNMENT);
        content.add(footer);

        card.add(content, BorderLayout.NORTH);

        return card;
    }

    private JPanel createCardRow(String labelText, JTextField field) {
        JPanel row = new JPanel(new BorderLayout(10, 0));
        row.setOpaque(false);
        row.setAlignmentX(Component.LEFT_ALIGNMENT);
        row.setMinimumSize(new Dimension(0, 38));
        row.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));

        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        label.setForeground(MUTED);
        label.setPreferredSize(new Dimension(62, 38));

        row.add(label, BorderLayout.WEST);
        row.add(field, BorderLayout.CENTER);
        return row;
    }

    private JTextField createCardField() {
        JTextField field = new JTextField();
        field.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        field.setForeground(INK);
        field.setCaretColor(PRIMARY_DARK);
        field.setBackground(SURFACE);
        field.setHorizontalAlignment(SwingConstants.CENTER);
        field.setPreferredSize(new Dimension(120, 38));
        field.setMinimumSize(new Dimension(80, 38));
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        field.setBorder(createFieldBorder(false));
        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                field.selectAll();
            }
        });
        return field;
    }

    private JPanel createResultsCard() {
        CardPanel card = new CardPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new EmptyBorder(18, 18, 18, 18));
        card.setPreferredSize(new Dimension(360, 400));
        card.setMinimumSize(new Dimension(320, 0));

        JLabel tag = new JLabel("RESULTS");
        tag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        tag.setForeground(FAINT);
        tag.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel heading = new JLabel("Round result");
        heading.setFont(new Font("Segoe UI", Font.BOLD, 18));
        heading.setForeground(INK);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel hint = new JLabel("Totals and winner for both players.");
        hint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        hint.setForeground(MUTED);
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);

        card.add(tag);
        card.add(Box.createVerticalStrut(10));
        card.add(heading);
        card.add(Box.createVerticalStrut(2));
        card.add(hint);
        card.add(Box.createVerticalStrut(14));

        total1ResultLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        total1ResultLabel.setForeground(INK);
        total1ResultLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        total2ResultLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        total2ResultLabel.setForeground(INK);
        total2ResultLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        card.add(total1ResultLabel);
        card.add(Box.createVerticalStrut(4));
        card.add(total2ResultLabel);
        card.add(Box.createVerticalStrut(12));

        JSeparator separator = new JSeparator();
        separator.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
        separator.setForeground(BORDER);
        card.add(separator);
        card.add(Box.createVerticalStrut(12));

        JLabel winnerTag = new JLabel("WINNER");
        winnerTag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        winnerTag.setForeground(FAINT);
        winnerTag.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(winnerTag);
        card.add(Box.createVerticalStrut(4));

        resultLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        resultLabel.setForeground(FAINT);
        resultLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(resultLabel);
        card.add(Box.createVerticalStrut(4));

        errorLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        errorLabel.setForeground(DANGER);
        errorLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(errorLabel);

        card.add(Box.createVerticalGlue());
        card.add(fullWidth(calculateButton, 44));
        card.add(Box.createVerticalStrut(8));
        card.add(fullWidth(clearButton, 38));
        card.add(Box.createVerticalStrut(12));

        JLabel methodsHint = new JLabel(
                "<html>Student methods: <b>sumCards(...)</b> \u00B7 <b>checkResult(...)</b></html>");
        methodsHint.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        methodsHint.setForeground(FAINT);
        methodsHint.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(methodsHint);

        calculateButton.addActionListener(e -> doCalculate());
        clearButton.addActionListener(e -> clearAll());

        return card;
    }

    private JComponent fullWidth(JButton button, int height) {
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setPreferredSize(new Dimension(320, height));
        button.setMinimumSize(new Dimension(0, height));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        return button;
    }

    private Border createFieldBorder(boolean error) {
        Color color = error ? DANGER : BORDER;
        int thickness = error ? 2 : 1;
        return new CompoundBorder(
                new LineBorder(color, thickness, true),
                new EmptyBorder(6, 10, 6, 10));
    }

    private void markError(JTextField field) {
        field.setBorder(createFieldBorder(true));
    }

    private void clearFieldErrors() {
        for (JTextField field : player1Fields) {
            field.setBorder(createFieldBorder(false));
        }
        for (JTextField field : player2Fields) {
            field.setBorder(createFieldBorder(false));
        }
    }

    private int[] readCards(JTextField[] fields) {
        int[] cards = new int[fields.length];
        for (int i = 0; i < fields.length; i++) {
            String text = fields[i].getText().trim();
            int value;
            try {
                value = Integer.parseInt(text);
            } catch (NumberFormatException ex) {
                value = -1;
            }

            if (value < 1 || value > 12) {
                markError(fields[i]);
                errorLabel.setText("Wrong card, please enter 1..12:");
                fields[i].requestFocusInWindow();
                return null;
            }
            cards[i] = value;
        }
        return cards;
    }

    private void doCalculate() {
        resetOutputs();
        clearFieldErrors();
        errorLabel.setText(" ");

        int[] player1Cards = readCards(player1Fields);
        if (player1Cards == null) {
            return;
        }

        int[] player2Cards = readCards(player2Fields);
        if (player2Cards == null) {
            return;
        }

        int player1Total = sumCards(player1Cards[0], player1Cards[1], player1Cards[2], player1Cards[3]);
        int player2Total = sumCards(player2Cards[0], player2Cards[1], player2Cards[2], player2Cards[3]);

        player1TotalLabel.setText("Total: " + player1Total);
        player2TotalLabel.setText("Total: " + player2Total);
        total1ResultLabel.setText("Total cards Player 1: " + player1Total);
        total2ResultLabel.setText("Total cards Player 2: " + player2Total);

        String result = checkResult(player1Total, player2Total);
        if (result == null || result.isBlank()) {
            resultLabel.setText("Complete checkResult(...)");
            resultLabel.setForeground(WARNING);
        } else {
            resultLabel.setText(result);
            resultLabel.setForeground(resultColor(result));
        }
    }

    private Color resultColor(String result) {
        if (result.startsWith("Player 1")) {
            return PLAYER1;
        }
        if (result.startsWith("Player 2")) {
            return PLAYER2;
        }
        return WARNING;
    }

    private void clearAll() {
        for (JTextField field : player1Fields) {
            field.setText("");
        }
        for (JTextField field : player2Fields) {
            field.setText("");
        }
        resetOutputs();
        clearFieldErrors();
        errorLabel.setText(" ");
        player1Fields[0].requestFocusInWindow();
    }

    private void resetOutputs() {
        player1TotalLabel.setText("Total: --");
        player2TotalLabel.setText("Total: --");
        total1ResultLabel.setText("Total cards Player 1: --");
        total2ResultLabel.setText("Total cards Player 2: --");
        resultLabel.setText("Waiting for cards...");
        resultLabel.setForeground(FAINT);
    }

    private void wireEnterNavigation() {
        for (int i = 0; i < 3; i++) {
            final int index = i;
            player1Fields[i].addActionListener(e -> player1Fields[index + 1].requestFocusInWindow());
            player2Fields[i].addActionListener(e -> player2Fields[index + 1].requestFocusInWindow());
        }
        player1Fields[3].addActionListener(e -> player2Fields[0].requestFocusInWindow());
        player2Fields[3].addActionListener(e -> doCalculate());
    }

   
    private static JButton createStyledButton(String text, Color color, Color foreground, boolean outline) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int w = getWidth();
                int h = getHeight();
                int arc = 12;

                if (outline) {
                    if (isEnabled() && getModel().isRollover()) {
                        g2.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 18));
                        g2.fillRoundRect(0, 0, w - 1, h - 1, arc, arc);
                    }
                    g2.setColor(isEnabled() ? color : FAINT);
                    g2.setStroke(new BasicStroke(1.5f));
                    g2.drawRoundRect(1, 1, w - 3, h - 3, arc, arc);
                } else {
                    Color base = isEnabled() ? color : new Color(203, 213, 225);
                    if (isEnabled() && getModel().isPressed()) {
                        base = color.darker();
                    } else if (isEnabled() && getModel().isRollover()) {
                        base = color.brighter();
                    }
                    g2.setColor(new Color(0, 0, 0, 26));
                    g2.fillRoundRect(0, 3, w, h - 3, arc, arc);
                    g2.setColor(base);
                    g2.fillRoundRect(0, 0, w, h - 3, arc, arc);
                }

                g2.dispose();
                super.paintComponent(g);
            }
        };
        button.setFont(new Font("Segoe UI", Font.BOLD, 12));
        button.setForeground(foreground);
        button.setBorder(new EmptyBorder(9, 12, 11, 12));
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setRolloverEnabled(true);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return button;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }

        SwingUtilities.invokeLater(() -> new TotalSumOfCardsSwing().setVisible(true));
    }

    private static final class CardPanel extends JPanel {

        CardPanel() {
            setOpaque(false);
            setBorder(new EmptyBorder(16, 18, 16, 18));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            g2.setColor(new Color(15, 23, 42, 20));
            g2.fillRoundRect(3, 5, w - 6, h - 7, 20, 20);

            g2.setColor(SURFACE);
            g2.fillRoundRect(0, 0, w - 6, h - 7, 20, 20);

            g2.setColor(BORDER);
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 7, h - 8, 20, 20);

            g2.dispose();
        }
    }

    private static final class CardsBadge extends JPanel {

        CardsBadge() {
            setOpaque(false);
            setPreferredSize(new Dimension(100, 100));
            setMinimumSize(new Dimension(88, 88));
            setMaximumSize(new Dimension(110, 110));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            g2.setColor(new Color(255, 255, 255, 34));
            g2.fillRoundRect(0, 0, w - 1, h - 1, 22, 22);

            g2.setColor(new Color(255, 255, 255, 80));
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 1, h - 1, 22, 22);

            drawCard(g2, 8, 20, 52, 70, "A", "\u2665", PLAYER2);
            drawCard(g2, 40, 8, 52, 70, "K", "\u2660", INK);

            g2.dispose();
        }

        private void drawCard(Graphics2D g2, int x, int y, int w, int h,
                String rank, String suit, Color color) {
            g2.setColor(new Color(15, 23, 42, 30));
            g2.fillRoundRect(x + 2, y + 3, w, h, 10, 10);

            g2.setColor(new Color(255, 255, 255, 240));
            g2.fillRoundRect(x, y, w, h, 10, 10);

            g2.setColor(color);
            g2.setStroke(new BasicStroke(1.5f));
            g2.drawRoundRect(x, y, w, h, 10, 10);

            g2.setFont(new Font("Segoe UI", Font.BOLD, 13));
            g2.drawString(rank, x + 6, y + 17);

            g2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
            g2.drawString(suit, x + w / 2 - 7, y + h / 2 + 8);
        }
    }
}
