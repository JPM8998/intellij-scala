val v: Int = 1

def f(implicit p: Int = 2): Int = {p}

println(/* */ f)