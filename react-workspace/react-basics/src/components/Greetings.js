import React from "react";

class Greetings extends React.Component{

    render(){
      return  <h1>Welcome, {this.props.name} </h1>
    }
}

export default Greetings