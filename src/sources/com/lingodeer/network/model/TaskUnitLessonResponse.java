package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class TaskUnitLessonResponse {
    private final JsonObject task_lesson_collection;
    private final JsonObject task_unit_collection;

    public TaskUnitLessonResponse(JsonObject task_lesson_collection, JsonObject task_unit_collection) {
        m.f(task_lesson_collection, "task_lesson_collection");
        m.f(task_unit_collection, "task_unit_collection");
        this.task_lesson_collection = task_lesson_collection;
        this.task_unit_collection = task_unit_collection;
    }

    public static /* synthetic */ TaskUnitLessonResponse copy$default(TaskUnitLessonResponse taskUnitLessonResponse, JsonObject jsonObject, JsonObject jsonObject2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jsonObject = taskUnitLessonResponse.task_lesson_collection;
        }
        if ((i11 & 2) != 0) {
            jsonObject2 = taskUnitLessonResponse.task_unit_collection;
        }
        return taskUnitLessonResponse.copy(jsonObject, jsonObject2);
    }

    public final JsonObject component1() {
        return this.task_lesson_collection;
    }

    public final JsonObject component2() {
        return this.task_unit_collection;
    }

    public final TaskUnitLessonResponse copy(JsonObject task_lesson_collection, JsonObject task_unit_collection) {
        m.f(task_lesson_collection, "task_lesson_collection");
        m.f(task_unit_collection, "task_unit_collection");
        return new TaskUnitLessonResponse(task_lesson_collection, task_unit_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskUnitLessonResponse)) {
            return false;
        }
        TaskUnitLessonResponse taskUnitLessonResponse = (TaskUnitLessonResponse) obj;
        return m.a(this.task_lesson_collection, taskUnitLessonResponse.task_lesson_collection) && m.a(this.task_unit_collection, taskUnitLessonResponse.task_unit_collection);
    }

    public final JsonObject getTask_lesson_collection() {
        return this.task_lesson_collection;
    }

    public final JsonObject getTask_unit_collection() {
        return this.task_unit_collection;
    }

    public int hashCode() {
        return this.task_unit_collection.hashCode() + (this.task_lesson_collection.hashCode() * 31);
    }

    public String toString() {
        return "TaskUnitLessonResponse(task_lesson_collection=" + this.task_lesson_collection + ", task_unit_collection=" + this.task_unit_collection + ")";
    }
}
