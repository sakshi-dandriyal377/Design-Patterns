import logo from './logo.svg';
import './App.css';
import Welcome from './components/Welcome';
import Greetings from './components/Greetings';
import { FirstComponent as FC, SecondComponent } from './components/MyComponent';
import MyComponent from './components/MyComponent';
import HelloWorld from './components/HelloWorld';
import Student from './components/Student';
import Employee from './components/Employee';
import User from './components/User';
import EventHandling from './components/EventHandling';
import ConditionalRendering from './components/ConditionalRendering';
function App() {

  const student = {
    name: "sakshi",
    email: "sakshi@gmail.com"
  }
  const skills = ['java','css','python']
  return (
    <div className="App">
      {/* <Welcome name ='sakshi'/>
      <Welcome name = 'dandriyal'/> */}
      {/* <Greetings name = "Sakshi Dandriyal"/>
      <FC/>
      <SecondComponent/>
      <MyComponent/> */}
      {/* <HelloWorld/> */}
      {/* <Student
        name = "Sakshi Dandriyal"
        email = "Sakshi@gmal.com"
        /> */}
        {/* <Student
           data = {skills}
        /> */}
        {/* <Student 
          name = "Sakshi Dandriyal"
        email = "Sakshi@gmal.com"
        /> */}
        {/* <Employee/> */}
       {/* <User/> */}
       {/* <EventHandling/> */}
       <ConditionalRendering/>
    </div>
  );
}

export default App;
