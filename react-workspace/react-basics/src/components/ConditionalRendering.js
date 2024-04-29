import { useState } from "react"

const ConditionalRendering = () => {

    const[isLoggedIn,setIsLoggedIn] = useState(false)
     let msg;
    if(isLoggedIn){
        msg =  <p>Welcome</p>
    }
    else{
        msg = <p>Please Login</p>
    }

    function handleLogin(){
        setIsLoggedIn(true)
    }

    return(
       <div>
            {/* <p>{msg}</p> */}
            {/* {
                isLoggedIn ? <p>Welcome</p> : <p>Please Login</p>
            } */}
            {
                isLoggedIn && <p>Welcome</p>
            }
            <button onClick={handleLogin}>Login</button>
       </div>
    )
}
export default ConditionalRendering