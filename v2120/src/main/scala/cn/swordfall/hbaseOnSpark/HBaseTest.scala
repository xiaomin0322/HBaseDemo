package cn.swordfall.hbaseOnSpark

/**
  * @Author: Yang JianQiu
  * @Date: 2019/2/12 10:54
  */
object HBaseTest {
  def main(args: Array[String]): Unit = {
    val hobs = new HBaseOnBasicSpark
    //hobs.writeToHBase()
    //hobs.writeToHBaseNewAPI()
    //hobs.readFromHBaseWithHBaseNewAPI()
    hobs.readFromHBaseWithHBaseNewAPIScan()
  }
}
