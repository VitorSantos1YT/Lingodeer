package fr;

import com.lingodeer.data.model.CourseLessonFinishStatus;
import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.TaskLessonCollectionItem;
import com.lingodeer.data.model.TaskUnitCollectionItem;
import com.lingodeer.data.model.TaskUnitLessonCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f27484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskUnitLessonCollection f27485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(i3 i3Var, TaskUnitLessonCollection taskUnitLessonCollection, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27482a = i11;
        this.f27484c = i3Var;
        this.f27485d = taskUnitLessonCollection;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27482a) {
            case 0:
                return new e3(this.f27484c, this.f27485d, dVar, 0);
            default:
                return new e3(this.f27484c, this.f27485d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27482a) {
            case 0:
                break;
        }
        return ((e3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f27482a;
        TaskUnitLessonCollection taskUnitLessonCollection = this.f27485d;
        i3 i3Var = this.f27484c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27483b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.k0 k0Var = i3Var.f27603d;
                List<TaskUnitCollectionItem> allTaskUnitCollection = taskUnitLessonCollection.getAllTaskUnitCollection();
                ArrayList arrayList = new ArrayList(ry.n.W(allTaskUnitCollection, 10));
                for (TaskUnitCollectionItem taskUnitCollectionItem : allTaskUnitCollection) {
                    arrayList.add(new CourseUnitFinishStatus(taskUnitCollectionItem.getId(), taskUnitCollectionItem.getLan(), taskUnitCollectionItem.getCurEnterLessonIndex(), taskUnitCollectionItem.getStoryReading(), taskUnitCollectionItem.getStorySpeaking(), taskUnitCollectionItem.getTipsReading(), taskUnitCollectionItem.getDialogWarmUp(), taskUnitCollectionItem.getDialogPractice(), taskUnitCollectionItem.getDialogSpeaking(), taskUnitCollectionItem.getTime(), false));
                }
                this.f27483b = 1;
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new bh.g0((bh.a1) k0Var, arrayList, null, 1), this);
                if (objM != wy.a.COROUTINE_SUSPENDED) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27483b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.k0 k0Var2 = i3Var.f27603d;
                List<TaskLessonCollectionItem> allTaskLessonCollection = taskUnitLessonCollection.getAllTaskLessonCollection();
                ArrayList arrayList2 = new ArrayList(ry.n.W(allTaskLessonCollection, 10));
                for (TaskLessonCollectionItem taskLessonCollectionItem : allTaskLessonCollection) {
                    arrayList2.add(new CourseLessonFinishStatus(taskLessonCollectionItem.getId(), taskLessonCollectionItem.getLan(), taskLessonCollectionItem.getPracticeListening(), taskLessonCollectionItem.getPracticeSpeaking(), taskLessonCollectionItem.getPracticeSpelling(), taskLessonCollectionItem.getPracticeComprehensive(), taskLessonCollectionItem.getTime(), false));
                }
                this.f27483b = 1;
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new bh.g0((bh.a1) k0Var2, arrayList2, null, 0), this);
                if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                    objM2 = b0Var;
                }
                return objM2 == aVar2 ? aVar2 : b0Var;
        }
    }
}
