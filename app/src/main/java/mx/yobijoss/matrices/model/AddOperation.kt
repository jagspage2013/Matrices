package mx.yobijoss.matrices.model

class AddOperation : Operation() {
    override fun getName() = "Sumar"

    override fun operate(matrix1: Array<DoubleArray>, matrix2: Array<DoubleArray>): Array<DoubleArray> {
        val resultArray = arrayOf(DoubleArray(4), DoubleArray(4), DoubleArray(4), DoubleArray(4))

        for (i in 0..3) {
            for (j in 0..3) {
                resultArray[i][j] = matrix1[i][j] + matrix2[i][j]
            }
        }
        return resultArray
    }
}
