package dsa;

public class test {


    //input=[0,3,4,-1,9,-4,-6,2]
    //input=[1,2,3,4,5,6,7,8]
    //2,1,4,3,6,5,8,7


    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};
        for(int i=0;i<input.length-1;i=i+2)
        {
            if(input[i]<input[i+1])
            {
                int temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
            }
        }
    }

    /*
    user :
    {
    [
    username : "abc",
     paswword : "xyz",
     browser : chrome

    ]
    []
    []
    }
     */
    /*

       Json jsonTestDataForUserLogin  =new ReadFile("pathToJson");
       ArrayList<User> users=jsonTestDataForUserLogin.user;
       for(User user:users)
       {
       if(user.browser = null)

        browser=await Palywrigt[].launch[user.browser];
        context=browser.newContext();
        page=context.mewPage();

        page.goto("applicationurl);
        LoginPage loginPage= new LoginPage(page);

        const isLoginSuccess=loginPage.loginToTheApplication(user.username,user.paswword);
        assert.Equal(isLoginSuccess,"FAILED || Expected login to Success");


        const isHomeButtonVisibleToTheUser=loginPage.isHomeButtonVisible();
        assert.Equal(isHomeButtonVisibleToTheUser,"FAILED || Expected Home Button To Appear For the user");


       }
     */

}
