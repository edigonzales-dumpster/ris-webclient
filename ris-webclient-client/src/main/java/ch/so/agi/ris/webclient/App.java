package ch.so.agi.ris.webclient;

import org.jboss.gwt.elemento.core.Elements;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Text;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import elemental2.dom.CSSProperties;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
//import gwt.material.design.client.constants.Color;
//import gwt.material.design.client.ui.html.Div;
import ol.Collection;
import ol.Coordinate;
import ol.Extent;
import ol.Feature;
import ol.FeatureOptions;
import ol.Map;
import ol.MapBrowserEvent;
import ol.MapOptions;
import ol.OLFactory;
import ol.View;
import ol.ViewOptions;
import ol.control.Control;
import ol.event.EventListener;
import ol.format.GeoJson;
import ol.format.Wkt;
import ol.geom.Geometry;
import ol.interaction.DefaultInteractionsOptions;
import ol.interaction.Interaction;
import ol.layer.Base;
import ol.layer.Image;
import ol.layer.LayerOptions;
import ol.layer.Tile;
import ol.layer.VectorLayerOptions;
import ol.proj.Projection;
import ol.proj.ProjectionOptions;
import ol.source.ImageWms;
import ol.source.ImageWmsOptions;
import ol.source.ImageWmsParams;
import ol.source.Vector;
import ol.source.VectorOptions;
import ol.source.Wmts;
import ol.source.WmtsOptions;
import ol.style.Stroke;
import ol.style.Style;
import ol.tilegrid.TileGrid;
import ol.tilegrid.WmtsTileGrid;
import ol.tilegrid.WmtsTileGridOptions;
import proj4.Proj4;

//import org.dominokit.addons.ol.presets.MapPresets;
//import org.dominokit.addons.ol.ui.MapCard;
//import org.dominokit.addons.ol.ui.MapView;
//import org.dominokit.domino.ui.cards.Card;
//import org.dominokit.domino.ui.grid.Column;
//import org.dominokit.domino.ui.grid.Row;
//import org.dominokit.domino.ui.utils.DominoElement;
//import org.dominokit.domino.ui.utils.TextNode;
//import org.jboss.gwt.elemento.core.Elements;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	
    private Map map;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
	    
	    GWT.log("Hallo Welt.");
	    
        HTMLElement el = Elements.div().style("background-color: hotpink; width: 600px; height: 700px;").get();
        el.setAttribute("id", "fubar");
        Elements.body().add(el);

        Map map = MapPresets.getBlackAndWhiteMap(el.getAttribute("id"));
	}
        


	
}
