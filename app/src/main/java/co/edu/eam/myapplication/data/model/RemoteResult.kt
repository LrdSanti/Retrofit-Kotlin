package co.edu.eam.myapplication.data.model

data class RemoteResult(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)