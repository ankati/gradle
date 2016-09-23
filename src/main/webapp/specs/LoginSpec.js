describe("ExtJSWebSpring App Test Suite", function () {
var mainPanel = null;
var ctlr = null;

  beforeEach (function () {
        // Initializing the mainPanel.
       
    
		mainPanel = Ext.create('ExtJSWebSpring.view.Login', {});
		//ctlr = mainPanel.getController();
	
       
             
        }

       
  ); // before each

  
  it ('Login View is loaded', function () {
      expect(mainPanel).toBe(null);
  });

});