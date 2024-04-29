const Student = (props) => {   //

    const {name,email} = props
    return (
        <div>
            <h1>Student details</h1>
            {/* <p>Name  :  {props.student.name} </p>
            <p>Email :  {props.student.email}</p> */}
            {/* <p>Array data : {props.data} </p> */}
            <p>Name : {name}</p>
            <p>Email : {email}</p>
        </div>
    )
}

export default Student