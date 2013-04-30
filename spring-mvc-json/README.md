Spring MVC JSON
===============

Spring MVC + JQuery + @RequestBody + JSON - making it work together
-------------------------------------------------------------------

* return java object as json type. --> @ResponseBody

  @RequestMapping(method = RequestMethod.GET)
  public @ResponseBody Person helloWorld(HttpServletResponse res) {
  	
  	Person person = new Person();
  	person.setId(1);
  	person.setName("hmk");
  	
      return person;
  }

* Receive json data sent by POST request and map it into java object. --> @RequestBody

@RequestMapping(value="person", method = RequestMethod.POST)
  public @ResponseBody Person getRequest( @RequestBody final  Person person) {	
      System.out.println(person.getId() + " " + person.getName());
      return person;
  }
