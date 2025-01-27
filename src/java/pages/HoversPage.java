package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static base.BrowserManager.getDriver;

public class HoversPage {
    private final By figureProfile = By.className("figure"); // List of figures
    private final By figureHeader = By.cssSelector(".figcaption h5"); // Figure header
    private final By figureLink = By.cssSelector(".figcaption a");    // Figure link

    /**
     * Hover over a figure by its index.
     *
     * @param index starts at 1
     * @return The hovered figure WebElement
     */
    public WebElement hoverOverFigure(int index) {
        List<WebElement> figures = getDriver().findElements(figureProfile);
        if (index < 1 || index > figures.size()) {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }

        WebElement figure = figures.get(index - 1);
        new Actions(getDriver()).moveToElement(figure).perform();
        return figure;
    }

    /**
     * Hover over a figure by visible text in its header.
     *
     * @param visibleText The text to match in the figure's header
     * @return The header text of the hovered figure
     */
    public String hoverOverFigure(String visibleText) {
        List<WebElement> figures = getDriver().findElements(figureProfile);
        Actions actions = new Actions(getDriver());

        for (WebElement figure : figures) {
            actions.moveToElement(figure).perform();
            String headerText = getFigureTitle(figure);

            if (headerText.contains(visibleText)) {
                System.out.println("'" + headerText + "' is found and selected.");  // debugging
                return headerText;
            }
        }
        throw new RuntimeException("Figure with visible text '" + visibleText + "' not found.");
    }

    /**
     * Retrieve the title of a specific figure.
     *
     * @param figure The parent figure WebElement
     * @return The text of the figure's header
     */
    public String getFigureTitle(WebElement figure) {
        return figure.findElement(figureHeader).getText();
    }

    /**
     * Retrieve the link of a specific figure.
     *
     * @param figure The parent figure WebElement
     * @return The href attribute of the figure's link
     */
    public String getFigureLink(WebElement figure) {
        return figure.findElement(figureLink).getDomAttribute("href");
    }
}
