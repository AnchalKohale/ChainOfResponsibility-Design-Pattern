class Main
{
	public static void main(String[] args)
	{	
        try{
            /* Creating a new virus instance and set the severity level just to test */
            CarAiVirus virus = new CarAiVirus(1);

            /* Creating testers instance */
            Engineer e1 = new Engineer();
            TeamLead t1 = new TeamLead();
            TechnicalOfficer ct1 = new TechnicalOfficer();
            Expert ee = new Expert();

            /* Set the hierarchy by using ofr each one by passing the instance of upper level tester */
            e1.setNextDebugger(t1);
            t1.setNextDebugger(ct1);
            ct1.setNextDebugger(ee);

            /* Give the virus to the lowest level tester */
            e1.debug(virus);
        }
        catch(Exception e){
            System.out.println(e + " :set the debugger chain correclty");
        }
	}
}
