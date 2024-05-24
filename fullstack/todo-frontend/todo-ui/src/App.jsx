import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ListTodoComponent from './components/ListTodoComponent'
import HeaderComponent from './components/HeaderComponent'
import FooterComponent from './components/FooterComponent'
import {BrowserRouter, Route, Routes} from 'react-router-dom'
import TodoComponent from './components/TodoComponent'
import RegisterComponent from './components/RegisterComponent'


function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <BrowserRouter>
        <HeaderComponent/>
        <Routes>
        
            {/* http://localhost:8080 */}
           <Route path='/' element = {<ListTodoComponent/>}></Route>
            {/* http://localhost:8080/todos */}
           <Route path='/todos' element = {<ListTodoComponent/>}></Route>
           {/* http://localhost:8080/add-todo */}
           <Route path='/add-todo' element = {<TodoComponent/>}></Route>
           {/* http://localhost:8080/update-todo/1 */}
            <Route path='/update-todo/:id' element = {<TodoComponent/>}></Route>
           {/* http://localhost:8080/register */}
            <Route path='/register' element = {<RegisterComponent/>}></Route>
        </Routes>
        <FooterComponent/>
      </BrowserRouter>
    </>
  )
}

export default App
