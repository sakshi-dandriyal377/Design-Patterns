import React from "react"
class Employee extends React.Component{

    constructor(props){
        super(props)
        this.state = {
            firstName : "Sakshi",
            lastName : "Dandriyal"

        }
    }

    updateEmployee (){
        this.setState({
            firstName : "Manshi",
            lastName : "Rawat"
        })
    }

    render(){
        return(
            <div>
                <h1>Employee Details</h1>
                <p>{this.state.firstName}</p>
                <p>{this.state.lastName}</p>
                <button onClick={() => this.updateEmployee()}>Update Employee</button>
            </div>
        )
    }
}

export default Employee