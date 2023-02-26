package bankofamerica.com;

import org.testng.annotations.DataProvider;

public class DataProviderExample {


    @DataProvider(name = "loginDataProvider")
    public Object[][] dataProvider() {
        Object[][] data = {{"sonia@gmail.com","sony15"},
                {"leti@gmail.com", "leti01"},
                {"marc56@gmail.com", "marc49"}};
        return data;


    }

}
