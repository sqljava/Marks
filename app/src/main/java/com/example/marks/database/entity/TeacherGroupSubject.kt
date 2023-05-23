package com.example.marks.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "teacher_group_subject", foreignKeys = [
    ForeignKey(Teacher::class, ["id"], ["teacher_id"]),
    ForeignKey(Group::class, ["id"], ["group_id"]),
    ForeignKey(Subject::class, ["id"], ["subject_id"]),
])
class TeacherGroupSubject(
    @PrimaryKey(autoGenerate = true) var id:Int = 0,
    @ColumnInfo(name = "teacher_id")
    var teacherId:Int,
    @ColumnInfo(name = "group_id")
    var groupId:Int,
    @ColumnInfo(name = "subject_id")
    var subjectId:Int,
)