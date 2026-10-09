package com.lingodeer.data.model;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class TaskUnitLessonCollection {
    private final List<TaskLessonCollectionItem> allTaskLessonCollection;
    private final List<TaskUnitCollectionItem> allTaskUnitCollection;

    public TaskUnitLessonCollection(List<TaskUnitCollectionItem> allTaskUnitCollection, List<TaskLessonCollectionItem> allTaskLessonCollection) {
        m.f(allTaskUnitCollection, "allTaskUnitCollection");
        m.f(allTaskLessonCollection, "allTaskLessonCollection");
        this.allTaskUnitCollection = allTaskUnitCollection;
        this.allTaskLessonCollection = allTaskLessonCollection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskUnitLessonCollection copy$default(TaskUnitLessonCollection taskUnitLessonCollection, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = taskUnitLessonCollection.allTaskUnitCollection;
        }
        if ((i11 & 2) != 0) {
            list2 = taskUnitLessonCollection.allTaskLessonCollection;
        }
        return taskUnitLessonCollection.copy(list, list2);
    }

    public final List<TaskUnitCollectionItem> component1() {
        return this.allTaskUnitCollection;
    }

    public final List<TaskLessonCollectionItem> component2() {
        return this.allTaskLessonCollection;
    }

    public final TaskUnitLessonCollection copy(List<TaskUnitCollectionItem> allTaskUnitCollection, List<TaskLessonCollectionItem> allTaskLessonCollection) {
        m.f(allTaskUnitCollection, "allTaskUnitCollection");
        m.f(allTaskLessonCollection, "allTaskLessonCollection");
        return new TaskUnitLessonCollection(allTaskUnitCollection, allTaskLessonCollection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskUnitLessonCollection)) {
            return false;
        }
        TaskUnitLessonCollection taskUnitLessonCollection = (TaskUnitLessonCollection) obj;
        return m.a(this.allTaskUnitCollection, taskUnitLessonCollection.allTaskUnitCollection) && m.a(this.allTaskLessonCollection, taskUnitLessonCollection.allTaskLessonCollection);
    }

    public final List<TaskLessonCollectionItem> getAllTaskLessonCollection() {
        return this.allTaskLessonCollection;
    }

    public final List<TaskUnitCollectionItem> getAllTaskUnitCollection() {
        return this.allTaskUnitCollection;
    }

    public int hashCode() {
        return this.allTaskLessonCollection.hashCode() + (this.allTaskUnitCollection.hashCode() * 31);
    }

    public String toString() {
        return "TaskUnitLessonCollection(allTaskUnitCollection=" + this.allTaskUnitCollection + ", allTaskLessonCollection=" + this.allTaskLessonCollection + ")";
    }
}
