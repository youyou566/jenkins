package org.devops
//打印内容
//def PrintMes(content){
//  println(content)
//}
//格式化输出(打印信息的方法ansiClor)
def PrintMes(value,clor){
  clors =  ['red'   : "\033[40;31m >>>>>>>>>>>${value}<<<<<<<<<<<<\033[0m",
            'blue'  : "\033[47;34m ${value} \033[0m",
            'green' : "[1;32m>>>>>>>>>>>${value}<<<<<<<<<<<<[m",
            'green1' : "\033[40;32m>>>>>>>>>>>${value}<<<<<<<<<<<< \033[0m" ]
  ansiColor('xterm'){
    println(clors[clor])
  }
   
}
