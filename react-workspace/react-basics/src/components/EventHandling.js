import { useState } from "react"

const EventHandling = () => {

    const [count,setCount] = useState(0)

    function handleClick(){
        setCount(count+1)
    }

    function handleReset(){
        setCount(0);
    }
    
    function minusCount(){
        setCount(count-1)
    }

    return(
        <div>
            <h1>Event Handling</h1>
            <p>Count : {count}</p>
            <button onClick={handleClick}>Increase count</button>
            <button onClick={handleReset}>Reset Count</button>
            <button onClick={minusCount}>Decrease Count</button>
        </div>
    )
}
export default EventHandling