import { useState } from "react";

const User = () => {
    // const[firstName,setFirstName] = useState('Sakshi')
    // const[lastName,setLastName] = useState('Dandriyal')

    const[user,setUser] = useState({
        firstName : "Sakshi",
        lastName : "Dandriyal"
    })

    function updateUser(){
        // setFirstName('Vivek')
        // setLastName('Rawat')
        setUser({
            firstName : "vivek",
            lastName : "Rawat"
        })
    }

    return(
        <div>
            <h1>User Details</h1>
            <p>{user.firstName}</p>
            <p>{user.lastName}</p>
            <button onClick={updateUser}>Update User</button>
        </div>
    )
}

export default User