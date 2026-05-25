/*

const browser=await playwright['chromium'].launch(options);
        const context=await browser.newContext();
const page=await context.newPage();


//partial match and exact match example
await page.getByRole('button', {name : 'Click me'}).click();
strict mode violation error -> if duplicates found because above one is partial match
await page.getByRole('button', {name : 'Click me', exact : true}).click();
above one only matches the button with exact name 'Click me' and not the one with 'Click me too'

//all locators , other than we can use css and xpath
await page.getByLabel('Username').fill('myusername'); //locate input field by
await page.getByPlaceholder('Enter your username').fill('myusername'); //locate input field by placeholder
await page.getByText('Submit').click(); //locate button by text content
await page.getByRole('button', {name : 'Submit'}).click(); //locate button by role and name
await page.getByTestId('submit-button').click(); //locate button by test id
await page.getByTitle('Submit').click(); //locate button by title attribute
await page.getByAltText('Submit').click(); //locate button by alt text

//force click example
await page.getByRole('button', {name : 'Submit'}).click(force : true); //force click even if the button is disabled or not visible

//drop down
await page.selectOption('select#country', 'USA'); //select option from dropdown by value
await page.selectOption('select#country', {label : 'United States'}); //select option from dropdown by label
await page.selectOption('select#country', {index : 0}); //select option from dropdown by index
await page.selectOption('select#country', {value : ['USA', 'CAN']}); //select multiple options from dropdown by value
await page.selectOption('select#country', {label : ['United States', 'Canada']}); //select multiple options from dropdown by label
await page.selectOption('select#country', {index : [0, 1]}); //select multiple options from dropdown by index
await page.selectOption('select#country', {value : 'USA', label : 'United States'}); //select option from dropdown by value and label

//get value and options from dropdown
        const value = await page.locator('#country').inputValue(); //one value
const options = await page.locator('select#my-dropdown option').allTextContents();
console.log(options); // ['Option 1', 'Option 2', 'Option 3']
await expect(page.locator('#my-dropdown option')).toHaveText([
                                                                     'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                                                                     'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'
                                                                     ]);


//iframe, use chain locators for iframe
await page.frameLocator('#my-iframe').getByRole('button', {name : 'Submit'}).click(); //locate button inside iframe and click


//table, use chain locators for table
const rowCount = await page.locator('table#my-table tbody tr').count(); //
console.log(`Number of rows in the table: ${rowCount}`);
        const cellValue = await page.locator('table#my-table tbody tr:nth-child(1).all();


//hover and scroll
                                             await page.getByRole('button', {name : 'Hover me'}).hover(); //hover over the button
await page.getByRole('button', {name : 'Scroll to me'}).scrollIntoViewIfNeeded(); //scroll to the button if it's not visible

//locator methods
await page.locator().nth(0); //select the first element from the locator
await page.locator().first(); //select the first element from the locator
await page.locator().last(); //select the last element from the locator
await page.locator().filter({hasText : 'Submit'}); //filter elements that contain
await page.locator().all(); //get all elements matching the locator


//download file example
const downloadPromise=page.waitForTheEvent(''download'').then(download => {
    // save downloaded file to disk
    download.saveAs('path/to/save/file');
});
await page.getByRole('button', {name : 'Download'}).click(); //click the button to trigger download
await downloadPromise; //wait for the download to complete


//upload file example
const [fileChooser] = await Promise.all([
                                        page.waitForEvent('filechooser'), //wait for file chooser to appear
  page.getByRole('button', {name : 'Upload'}).click() //click the button to trigger file chooser
]);
await fileChooser.setFiles('path/to/file'); //set the file to upload

//different events
await page.waitForEvent('popup'); //wait for a new page to open
await page.waitForEvent('download'); //wait for a file to be downloaded
await page.waitForEvent('filechooser'); //wait for a file chooser to appear
await page.waitForEvent('console'); //wait for a console message to be logged
await page.waitForEvent('dialog'); //wait for a dialog to appear
await page.waitForEvent('request'); //wait for a network request to be made
await page.waitForEvent('response'); //wait for a network response to be received

//wait for navigation using network idle,load,domcontentloaded 
await page.waitForNavigation(); //wait for any navigation to complete
await page.waitForNavigation({waitUntil : 'networkidle'}); //wait for navigation to complete and no network requests for at least 500ms
await page.waitForNavigation({waitUntil : 'load'}); //wait for navigation to complete
await page.waitForNavigation({waitUntil : 'domcontentloaded'}); //wait for navigation to complete and DOM content to be loaded


//wait for load state, same as above but without navigation
await page.waitForLoadState(); //wait for the page to load
await page.waitForLoadState('networkidle'); //wait for the page to load and no network requests for at least 500ms
await page.waitForLoadState('load'); //wait for the page to load
await page.waitForLoadState('domcontentloaded'); //wait for the page to load and DOM content to be loaded


//diff between auto wait and wait for selector
auto wait is built in mechanism that automatically waits for elements to be ready before performing actions on them, while wait for selector is an explicit method that waits for a specific element to appear in the DOM before proceeding with the next steps in the test. Auto wait is implicit and applies to all actions, while wait for selector is explicit and only applies to the specific element being waited for.*/
