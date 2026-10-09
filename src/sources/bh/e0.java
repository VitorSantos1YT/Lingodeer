package bh;

import androidx.lifecycle.ViewModel;
import bp.g2;
import com.google.api.Service;
import com.lingodeer.data.model.BillingStatusKt;
import com.lingodeer.data.model.BookmarkKt;
import com.lingodeer.data.model.CourseLessonFinishStatusKt;
import com.lingodeer.data.model.DailyLearnHistoryKt;
import com.lingodeer.data.model.DailyLearnTimeHistoryKt;
import com.lingodeer.data.model.DailyStreakHistoryKt;
import com.lingodeer.data.model.KnowledgeNote;
import com.lingodeer.data.model.KnowledgeNoteKt;
import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.data.model.LoginHistoryKt;
import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.data.model.ReviewStatusKt;
import com.lingodeer.data.model.uistate.CommonUiState;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import com.lingodeer.database.model.BillingStatusEntity;
import com.lingodeer.database.model.BookmarkEntity;
import com.lingodeer.database.model.DailyLearnHistoryEntity;
import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import com.lingodeer.database.model.DailyStreakHistoryEntity;
import com.lingodeer.database.model.DbFileVersionEntity;
import com.lingodeer.database.model.KnowledgeNoteEntity;
import com.lingodeer.database.model.LessonFinishStatusEntity;
import com.lingodeer.database.model.LoginHistoryEntity;
import com.lingodeer.database.model.ReviewStatusEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.g4;
import fr.k3;
import fr.l3;
import fr.q4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f4198b;

    public /* synthetic */ e0(uz.j jVar, int i11) {
        this.f4197a = i11;
        this.f4198b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r8, vy.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof gp.b1
            if (r0 == 0) goto L13
            r0 = r9
            gp.b1 r0 = (gp.b1) r0
            int r1 = r0.f29345b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29345b = r1
            goto L18
        L13:
            gp.b1 r0 = new gp.b1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f29344a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f29345b
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            com.bumptech.glide.e.F(r9)
            goto L69
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            int r8 = r0.f29348e
            uz.j r2 = r0.f29347d
            com.bumptech.glide.e.F(r9)
            goto L5c
        L3b:
            com.bumptech.glide.e.F(r9)
            tt.a r8 = (tt.a) r8
            yz.f r8 = rz.o0.f50940a
            yz.e r8 = yz.e.f58387a
            bp.g2 r9 = new bp.g2
            r2 = 9
            r9.<init>(r4, r2, r5)
            uz.j r2 = r7.f4198b
            r0.f29347d = r2
            r6 = 0
            r0.f29348e = r6
            r0.f29345b = r3
            java.lang.Object r9 = rz.e0.M(r8, r9, r0)
            if (r9 != r1) goto L5b
            goto L68
        L5b:
            r8 = r6
        L5c:
            r0.f29347d = r5
            r0.f29348e = r8
            r0.f29345b = r4
            java.lang.Object r8 = r2.emit(r9, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.e0.a(java.lang.Object, vy.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r8, vy.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof gp.c1
            if (r0 == 0) goto L13
            r0 = r9
            gp.c1 r0 = (gp.c1) r0
            int r1 = r0.f29354b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29354b = r1
            goto L18
        L13:
            gp.c1 r0 = new gp.c1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f29353a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f29354b
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            com.bumptech.glide.e.F(r9)
            goto L66
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            int r8 = r0.f29357e
            uz.j r2 = r0.f29356d
            com.bumptech.glide.e.F(r9)
            goto L59
        L3b:
            com.bumptech.glide.e.F(r9)
            tt.a r8 = (tt.a) r8
            uz.j r2 = r7.f4198b
            r0.f29356d = r2
            r8 = 0
            r0.f29357e = r8
            r0.f29354b = r3
            yz.f r9 = rz.o0.f50940a
            bp.g2 r3 = new bp.g2
            r6 = 13
            r3.<init>(r4, r6, r5)
            java.lang.Object r9 = rz.e0.M(r9, r3, r0)
            if (r9 != r1) goto L59
            goto L65
        L59:
            r0.f29356d = r5
            r0.f29357e = r8
            r0.f29354b = r4
            java.lang.Object r8 = r2.emit(r9, r0)
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.e0.b(java.lang.Object, vy.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0209  */
    /* JADX WARN: Code duplicated, block: B:139:0x0268  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:181:0x0326  */
    /* JADX WARN: Code duplicated, block: B:202:0x0381  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:228:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:249:0x0445  */
    /* JADX WARN: Code duplicated, block: B:269:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:286:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:289:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:296:0x0510  */
    /* JADX WARN: Code duplicated, block: B:316:0x056a  */
    /* JADX WARN: Code duplicated, block: B:335:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0603  */
    /* JADX WARN: Code duplicated, block: B:375:0x065d  */
    /* JADX WARN: Code duplicated, block: B:394:0x069c  */
    /* JADX WARN: Code duplicated, block: B:414:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:434:0x0759  */
    /* JADX WARN: Code duplicated, block: B:460:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:486:0x086b  */
    /* JADX WARN: Code duplicated, block: B:505:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:525:0x0904  */
    /* JADX WARN: Code duplicated, block: B:545:0x095e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:565:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:585:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:648:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:97:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r8v0, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v1, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v11, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v13, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v15, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v17, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v19, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v5, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v7, types: [uz.j] */
    /* JADX WARN: Type inference failed for: r8v9, types: [uz.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        d0 d0Var;
        h0 h0Var;
        cu.d dVar2;
        fr.m mVar;
        fr.p pVar;
        fr.q qVar;
        fr.a0 a0Var;
        fr.b0 b0Var;
        fr.d0 d0Var2;
        fr.r0 r0Var;
        fr.s0 s0Var;
        fr.u0 u0Var;
        k3 k3Var;
        l3 l3Var;
        g4 g4Var;
        q4 q4Var;
        BillingStatusEntity billingStatusEntity;
        String purchaseType;
        gp.q qVar2;
        gp.s sVar;
        boolean zBooleanValue;
        ?? r9;
        gp.u uVar;
        Object success;
        Object obj2;
        gp.t0 t0Var;
        ?? r11;
        gp.u0 u0Var2;
        ?? r12;
        gp.v0 v0Var;
        ?? r13;
        gp.w0 w0Var;
        ?? r14;
        gp.x0 x0Var;
        ?? r15;
        gp.y0 y0Var;
        ?? r16;
        gp.z0 z0Var;
        ?? r17;
        gp.a1 a1Var;
        ?? r18;
        gp.e1 e1Var;
        ?? r19;
        int i11 = this.f4197a;
        int i12 = 18;
        int i13 = 10;
        int i14 = 2;
        int i15 = 0;
        ?? AsExternalModel = 0;
        Object obj3 = null;
        qy.b0 b0Var2 = qy.b0.f48488a;
        ?? r21 = this.f4198b;
        switch (i11) {
            case 0:
                if (dVar instanceof d0) {
                    d0Var = (d0) dVar;
                    int i16 = d0Var.f4185b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        d0Var.f4185b = i16 - Integer.MIN_VALUE;
                    } else {
                        d0Var = new d0(this, dVar);
                    }
                } else {
                    d0Var = new d0(this, dVar);
                }
                Object obj4 = d0Var.f4184a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i17 = d0Var.f4185b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj4);
                LearnProgress learnProgress = (LearnProgress) obj;
                Integer num = new Integer(learnProgress.getPronun() == 0 ? 1 : learnProgress.getPronun());
                d0Var.f4185b = 1;
                return r21.emit(num, d0Var) == aVar ? aVar : b0Var2;
            case 1:
                if (dVar instanceof h0) {
                    h0Var = (h0) dVar;
                    int i18 = h0Var.f4223b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        h0Var.f4223b = i18 - Integer.MIN_VALUE;
                    } else {
                        h0Var = new h0(this, dVar);
                    }
                } else {
                    h0Var = new h0(this, dVar);
                }
                Object obj5 = h0Var.f4222a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i19 = h0Var.f4223b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj5);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj5);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(CourseLessonFinishStatusKt.asExternalModel((LessonFinishStatusEntity) it.next()));
                }
                h0Var.f4223b = 1;
                return r21.emit(arrayList, h0Var) == aVar2 ? aVar2 : b0Var2;
            case 2:
                if (dVar instanceof cu.d) {
                    dVar2 = (cu.d) dVar;
                    int i21 = dVar2.f22499b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        dVar2.f22499b = i21 - Integer.MIN_VALUE;
                    } else {
                        dVar2 = new cu.d(this, dVar);
                    }
                } else {
                    dVar2 = new cu.d(this, dVar);
                }
                Object obj6 = dVar2.f22498a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i22 = dVar2.f22499b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj6);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj6);
                DbFileVersionEntity dbFileVersionEntity = (DbFileVersionEntity) obj;
                Boolean boolValueOf = Boolean.valueOf(dbFileVersionEntity != null ? dbFileVersionEntity.getNeedUpdate() : true);
                dVar2.f22499b = 1;
                return r21.emit(boolValueOf, dVar2) == aVar3 ? aVar3 : b0Var2;
            case 3:
                if (dVar instanceof fr.m) {
                    mVar = (fr.m) dVar;
                    int i23 = mVar.f27689b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        mVar.f27689b = i23 - Integer.MIN_VALUE;
                    } else {
                        mVar = new fr.m(this, dVar);
                    }
                } else {
                    mVar = new fr.m(this, dVar);
                }
                Object obj7 = mVar.f27688a;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i24 = mVar.f27689b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj7);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj7);
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(BookmarkKt.asExternalModel((BookmarkEntity) it2.next()));
                }
                mVar.f27689b = 1;
                return r21.emit(arrayList2, mVar) == aVar4 ? aVar4 : b0Var2;
            case 4:
                if (dVar instanceof fr.p) {
                    pVar = (fr.p) dVar;
                    int i25 = pVar.f27768b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        pVar.f27768b = i25 - Integer.MIN_VALUE;
                    } else {
                        pVar = new fr.p(this, dVar);
                    }
                } else {
                    pVar = new fr.p(this, dVar);
                }
                Object obj8 = pVar.f27767a;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i26 = pVar.f27768b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj8);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj8);
                List list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList(ry.n.W(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(BookmarkKt.asExternalModel((BookmarkEntity) it3.next()));
                }
                pVar.f27768b = 1;
                return r21.emit(arrayList3, pVar) == aVar5 ? aVar5 : b0Var2;
            case 5:
                if (dVar instanceof fr.q) {
                    qVar = (fr.q) dVar;
                    int i27 = qVar.f27784b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        qVar.f27784b = i27 - Integer.MIN_VALUE;
                    } else {
                        qVar = new fr.q(this, dVar);
                    }
                } else {
                    qVar = new fr.q(this, dVar);
                }
                Object obj9 = qVar.f27783a;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i28 = qVar.f27784b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj9);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj9);
                BookmarkEntity bookmarkEntity = (BookmarkEntity) obj;
                AsExternalModel = bookmarkEntity != null ? BookmarkKt.asExternalModel(bookmarkEntity) : 0;
                qVar.f27784b = 1;
                return r21.emit(AsExternalModel, qVar) == aVar6 ? aVar6 : b0Var2;
            case 6:
                if (dVar instanceof fr.a0) {
                    a0Var = (fr.a0) dVar;
                    int i29 = a0Var.f27384b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        a0Var.f27384b = i29 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new fr.a0(this, dVar);
                    }
                } else {
                    a0Var = new fr.a0(this, dVar);
                }
                Object obj10 = a0Var.f27383a;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i30 = a0Var.f27384b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj10);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj10);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj11 : (List) obj) {
                    if (!kotlin.jvm.internal.m.a(((DailyLearnHistoryEntity) obj11).getId(), "olddata")) {
                        arrayList4.add(obj11);
                    }
                }
                List listS0 = ry.m.S0(arrayList4, new b4.e(16));
                ArrayList arrayList5 = new ArrayList(ry.n.W(listS0, 10));
                Iterator it4 = listS0.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(DailyLearnHistoryKt.asExternalModel((DailyLearnHistoryEntity) it4.next()));
                }
                a0Var.f27384b = 1;
                return r21.emit(arrayList5, a0Var) == aVar7 ? aVar7 : b0Var2;
            case 7:
                if (dVar instanceof fr.b0) {
                    b0Var = (fr.b0) dVar;
                    int i31 = b0Var.f27405b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        b0Var.f27405b = i31 - Integer.MIN_VALUE;
                    } else {
                        b0Var = new fr.b0(this, dVar);
                    }
                } else {
                    b0Var = new fr.b0(this, dVar);
                }
                Object obj12 = b0Var.f27404a;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i32 = b0Var.f27405b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj12);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj12);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj13 : (List) obj) {
                    if (!kotlin.jvm.internal.m.a(((DailyLearnTimeHistoryEntity) obj13).getId(), "olddata")) {
                        arrayList6.add(obj13);
                    }
                }
                List listS1 = ry.m.S0(arrayList6, new b4.e(17));
                ArrayList arrayList7 = new ArrayList(ry.n.W(listS1, 10));
                Iterator it5 = listS1.iterator();
                while (it5.hasNext()) {
                    arrayList7.add(DailyLearnTimeHistoryKt.asExternalModel((DailyLearnTimeHistoryEntity) it5.next()));
                }
                b0Var.f27405b = 1;
                return r21.emit(arrayList7, b0Var) == aVar8 ? aVar8 : b0Var2;
            case 8:
                if (dVar instanceof fr.d0) {
                    d0Var2 = (fr.d0) dVar;
                    int i33 = d0Var2.f27456b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        d0Var2.f27456b = i33 - Integer.MIN_VALUE;
                    } else {
                        d0Var2 = new fr.d0(this, dVar);
                    }
                } else {
                    d0Var2 = new fr.d0(this, dVar);
                }
                Object obj14 = d0Var2.f27455a;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i34 = d0Var2.f27456b;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj14);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj14);
                List listS2 = ry.m.S0((List) obj, new b4.e(i12));
                ArrayList arrayList8 = new ArrayList(ry.n.W(listS2, 10));
                Iterator it6 = listS2.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(DailyStreakHistoryKt.asExternalModel((DailyStreakHistoryEntity) it6.next()));
                }
                d0Var2.f27456b = 1;
                return r21.emit(arrayList8, d0Var2) == aVar9 ? aVar9 : b0Var2;
            case 9:
                if (dVar instanceof fr.r0) {
                    r0Var = (fr.r0) dVar;
                    int i35 = r0Var.f27805b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        r0Var.f27805b = i35 - Integer.MIN_VALUE;
                    } else {
                        r0Var = new fr.r0(this, dVar);
                    }
                } else {
                    r0Var = new fr.r0(this, dVar);
                }
                Object obj15 = r0Var.f27804a;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i36 = r0Var.f27805b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj15);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj15);
                List list4 = (List) obj;
                ArrayList arrayList9 = new ArrayList(ry.n.W(list4, 10));
                Iterator it7 = list4.iterator();
                while (it7.hasNext()) {
                    arrayList9.add(KnowledgeNoteKt.asExternalModel((KnowledgeNoteEntity) it7.next()));
                }
                r0Var.f27805b = 1;
                return r21.emit(arrayList9, r0Var) == aVar10 ? aVar10 : b0Var2;
            case 10:
                if (dVar instanceof fr.s0) {
                    s0Var = (fr.s0) dVar;
                    int i37 = s0Var.f27824b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        s0Var.f27824b = i37 - Integer.MIN_VALUE;
                    } else {
                        s0Var = new fr.s0(this, dVar);
                    }
                } else {
                    s0Var = new fr.s0(this, dVar);
                }
                Object obj16 = s0Var.f27823a;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i38 = s0Var.f27824b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj16);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj16);
                KnowledgeNoteEntity knowledgeNoteEntity = (KnowledgeNoteEntity) obj;
                KnowledgeNote knowledgeNoteAsExternalModel = knowledgeNoteEntity != null ? KnowledgeNoteKt.asExternalModel(knowledgeNoteEntity) : null;
                s0Var.f27824b = 1;
                return r21.emit(knowledgeNoteAsExternalModel, s0Var) == aVar11 ? aVar11 : b0Var2;
            case 11:
                if (dVar instanceof fr.u0) {
                    u0Var = (fr.u0) dVar;
                    int i39 = u0Var.f27877b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        u0Var.f27877b = i39 - Integer.MIN_VALUE;
                    } else {
                        u0Var = new fr.u0(this, dVar);
                    }
                } else {
                    u0Var = new fr.u0(this, dVar);
                }
                Object obj17 = u0Var.f27876a;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i40 = u0Var.f27877b;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj17);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj17);
                List list5 = (List) obj;
                ArrayList arrayList10 = new ArrayList(ry.n.W(list5, 10));
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    arrayList10.add(KnowledgeNoteKt.asExternalModel((KnowledgeNoteEntity) it8.next()));
                }
                u0Var.f27877b = 1;
                return r21.emit(arrayList10, u0Var) == aVar12 ? aVar12 : b0Var2;
            case 12:
                if (dVar instanceof k3) {
                    k3Var = (k3) dVar;
                    int i41 = k3Var.f27651b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        k3Var.f27651b = i41 - Integer.MIN_VALUE;
                    } else {
                        k3Var = new k3(this, dVar);
                    }
                } else {
                    k3Var = new k3(this, dVar);
                }
                Object obj18 = k3Var.f27650a;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i42 = k3Var.f27651b;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj18);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj18);
                List list6 = (List) obj;
                ArrayList arrayList11 = new ArrayList(ry.n.W(list6, 10));
                Iterator it9 = list6.iterator();
                while (it9.hasNext()) {
                    arrayList11.add(ReviewStatusKt.asExternalModel((ReviewStatusEntity) it9.next()));
                }
                k3Var.f27651b = 1;
                return r21.emit(arrayList11, k3Var) == aVar13 ? aVar13 : b0Var2;
            case 13:
                if (dVar instanceof l3) {
                    l3Var = (l3) dVar;
                    int i43 = l3Var.f27680b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        l3Var.f27680b = i43 - Integer.MIN_VALUE;
                    } else {
                        l3Var = new l3(this, dVar);
                    }
                } else {
                    l3Var = new l3(this, dVar);
                }
                Object obj19 = l3Var.f27679a;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i44 = l3Var.f27680b;
                if (i44 != 0) {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj19);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj19);
                ReviewStatusEntity reviewStatusEntity = (ReviewStatusEntity) obj;
                ReviewStatus reviewStatusAsExternalModel = reviewStatusEntity != null ? ReviewStatusKt.asExternalModel(reviewStatusEntity) : null;
                l3Var.f27680b = 1;
                return r21.emit(reviewStatusAsExternalModel, l3Var) == aVar14 ? aVar14 : b0Var2;
            case 14:
                if (dVar instanceof g4) {
                    g4Var = (g4) dVar;
                    int i45 = g4Var.f27546b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        g4Var.f27546b = i45 - Integer.MIN_VALUE;
                    } else {
                        g4Var = new g4(this, dVar);
                    }
                } else {
                    g4Var = new g4(this, dVar);
                }
                Object obj20 = g4Var.f27545a;
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i46 = g4Var.f27546b;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj20);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj20);
                List list7 = (List) obj;
                ArrayList arrayList12 = new ArrayList(ry.n.W(list7, 10));
                Iterator it10 = list7.iterator();
                while (it10.hasNext()) {
                    arrayList12.add(LoginHistoryKt.asExternalModel((LoginHistoryEntity) it10.next()));
                }
                g4Var.f27546b = 1;
                return r21.emit(arrayList12, g4Var) == aVar15 ? aVar15 : b0Var2;
            case 15:
                if (dVar instanceof q4) {
                    q4Var = (q4) dVar;
                    int i47 = q4Var.f27801b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        q4Var.f27801b = i47 - Integer.MIN_VALUE;
                    } else {
                        q4Var = new q4(this, dVar);
                    }
                } else {
                    q4Var = new q4(this, dVar);
                }
                Object obj21 = q4Var.f27800a;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i48 = q4Var.f27801b;
                if (i48 != 0) {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj21);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj21);
                for (Object obj22 : (List) obj) {
                    if (System.currentTimeMillis() < BillingStatusKt.asExternalModel((BillingStatusEntity) obj22).getExpiredDateMs()) {
                        obj3 = obj22;
                        billingStatusEntity = (BillingStatusEntity) obj3;
                        if (billingStatusEntity != null || (purchaseType = billingStatusEntity.getPurchaseType()) == null) {
                            purchaseType = BuildConfig.VERSION_NAME;
                        }
                        q4Var.f27801b = 1;
                        if (r21.emit(purchaseType, q4Var) == aVar16) {
                            return aVar16;
                        }
                        return b0Var2;
                    }
                }
                billingStatusEntity = (BillingStatusEntity) obj3;
                if (billingStatusEntity != null) {
                    purchaseType = BuildConfig.VERSION_NAME;
                } else {
                    purchaseType = BuildConfig.VERSION_NAME;
                }
                q4Var.f27801b = 1;
                if (r21.emit(purchaseType, q4Var) == aVar16) {
                    return aVar16;
                }
                return b0Var2;
            case 16:
                if (dVar instanceof gp.q) {
                    qVar2 = (gp.q) dVar;
                    int i49 = qVar2.f29483b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        qVar2.f29483b = i49 - Integer.MIN_VALUE;
                    } else {
                        qVar2 = new gp.q(this, dVar);
                    }
                } else {
                    qVar2 = new gp.q(this, dVar);
                }
                Object obj23 = qVar2.f29482a;
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i50 = qVar2.f29483b;
                if (i50 != 0) {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj23);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj23);
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                br.e0 e0Var = br.e0.f5029d;
                br.g0 g0Var = br.g0.f5036d;
                br.d0 d0Var3 = br.d0.f5026d;
                List listL = zBooleanValue2 ? ns.o.L(d0Var3, g0Var, e0Var) : ns.o.L(d0Var3, g0Var, br.f0.f5032d, e0Var);
                qVar2.f29483b = 1;
                return r21.emit(listL, qVar2) == aVar17 ? aVar17 : b0Var2;
            case 17:
                if (dVar instanceof gp.s) {
                    sVar = (gp.s) dVar;
                    int i51 = sVar.f29492b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        sVar.f29492b = i51 - Integer.MIN_VALUE;
                    } else {
                        sVar = new gp.s(this, dVar);
                    }
                } else {
                    sVar = new gp.s(this, dVar);
                }
                Object objM = sVar.f29491a;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i52 = sVar.f29492b;
                if (i52 == 0) {
                    com.bumptech.glide.e.F(objM);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    g2 g2Var = new g2(i14, 6, AsExternalModel);
                    sVar.f29494d = r21;
                    sVar.f29495e = 0;
                    sVar.f29496f = zBooleanValue;
                    sVar.f29492b = 1;
                    objM = rz.e0.M(eVar, g2Var, sVar);
                    if (objM != aVar18) {
                    }
                    r9 = r21;
                    return aVar18;
                }
                if (i52 != 1) {
                    if (i52 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM);
                    return b0Var2;
                }
                zBooleanValue = sVar.f29496f;
                i15 = sVar.f29495e;
                uz.j jVar = sVar.f29494d;
                com.bumptech.glide.e.F(objM);
                r9 = jVar;
                r9 = r21;
                CommonUiState.Success success2 = new CommonUiState.Success(zBooleanValue, ((Number) objM).intValue());
                sVar.f29494d = null;
                sVar.f29495e = i15;
                sVar.f29492b = 2;
                if (r9.emit(success2, sVar) != aVar18) {
                    return b0Var2;
                }
                r9 = r21;
                return aVar18;
            case 18:
                if (dVar instanceof gp.u) {
                    uVar = (gp.u) dVar;
                    int i53 = uVar.f29508b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        uVar.f29508b = i53 - Integer.MIN_VALUE;
                    } else {
                        uVar = new gp.u(this, dVar);
                    }
                } else {
                    uVar = new gp.u(this, dVar);
                }
                Object obj24 = uVar.f29507a;
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i54 = uVar.f29508b;
                if (i54 != 0) {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj24);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj24);
                tt.b bVar = (tt.b) obj;
                if (bVar == null) {
                    success = CompleteOneLessonUiState.Idle.INSTANCE;
                } else {
                    if (bVar.f52535c) {
                        obj2 = null;
                    } else {
                        bVar.f52535c = true;
                        obj2 = bVar.f52533a;
                    }
                    if (((String) obj2) != null) {
                        success = new CompleteOneLessonUiState.Success(ry.r.f50854a, null, null);
                    } else {
                        success = CompleteOneLessonUiState.Idle.INSTANCE;
                    }
                }
                uVar.f29508b = 1;
                return r21.emit(success, uVar) == aVar19 ? aVar19 : b0Var2;
            case 19:
                if (dVar instanceof gp.t0) {
                    t0Var = (gp.t0) dVar;
                    int i55 = t0Var.f29503b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        t0Var.f29503b = i55 - Integer.MIN_VALUE;
                    } else {
                        t0Var = new gp.t0(this, dVar);
                    }
                } else {
                    t0Var = new gp.t0(this, dVar);
                }
                Object objM2 = t0Var.f29502a;
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i56 = t0Var.f29503b;
                if (i56 == 0) {
                    com.bumptech.glide.e.F(objM2);
                    yz.f fVar2 = rz.o0.f50940a;
                    g2 g2Var2 = new g2(i14, i13, AsExternalModel);
                    t0Var.f29505d = r21;
                    t0Var.f29506e = 0;
                    t0Var.f29503b = 1;
                    objM2 = rz.e0.M(fVar2, g2Var2, t0Var);
                    if (objM2 != aVar20) {
                    }
                    r11 = r21;
                    return aVar20;
                }
                if (i56 != 1) {
                    if (i56 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM2);
                    return b0Var2;
                }
                i15 = t0Var.f29506e;
                uz.j jVar2 = t0Var.f29505d;
                com.bumptech.glide.e.F(objM2);
                r11 = jVar2;
                r11 = r21;
                t0Var.f29505d = null;
                t0Var.f29506e = i15;
                t0Var.f29503b = 2;
                if (r11.emit(objM2, t0Var) != aVar20) {
                    return b0Var2;
                }
                r11 = r21;
                return aVar20;
            case 20:
                if (dVar instanceof gp.u0) {
                    u0Var2 = (gp.u0) dVar;
                    int i57 = u0Var2.f29511b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        u0Var2.f29511b = i57 - Integer.MIN_VALUE;
                    } else {
                        u0Var2 = new gp.u0(this, dVar);
                    }
                } else {
                    u0Var2 = new gp.u0(this, dVar);
                }
                Object objM3 = u0Var2.f29510a;
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i58 = u0Var2.f29511b;
                if (i58 == 0) {
                    com.bumptech.glide.e.F(objM3);
                    yz.f fVar3 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    g2 g2Var3 = new g2(i14, 15, AsExternalModel);
                    u0Var2.f29513d = r21;
                    u0Var2.f29514e = 0;
                    u0Var2.f29511b = 1;
                    objM3 = rz.e0.M(eVar2, g2Var3, u0Var2);
                    if (objM3 != aVar21) {
                    }
                    r12 = r21;
                    return aVar21;
                }
                if (i58 != 1) {
                    if (i58 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM3);
                    return b0Var2;
                }
                i15 = u0Var2.f29514e;
                uz.j jVar3 = u0Var2.f29513d;
                com.bumptech.glide.e.F(objM3);
                r12 = jVar3;
                r12 = r21;
                u0Var2.f29513d = null;
                u0Var2.f29514e = i15;
                u0Var2.f29511b = 2;
                if (r12.emit(objM3, u0Var2) != aVar21) {
                    return b0Var2;
                }
                r12 = r21;
                return aVar21;
            case 21:
                if (dVar instanceof gp.v0) {
                    v0Var = (gp.v0) dVar;
                    int i59 = v0Var.f29520b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        v0Var.f29520b = i59 - Integer.MIN_VALUE;
                    } else {
                        v0Var = new gp.v0(this, dVar);
                    }
                } else {
                    v0Var = new gp.v0(this, dVar);
                }
                Object objM4 = v0Var.f29519a;
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i60 = v0Var.f29520b;
                if (i60 == 0) {
                    com.bumptech.glide.e.F(objM4);
                    yz.f fVar4 = rz.o0.f50940a;
                    yz.e eVar3 = yz.e.f58387a;
                    g2 g2Var4 = new g2(i14, 21, AsExternalModel);
                    v0Var.f29522d = r21;
                    v0Var.f29523e = 0;
                    v0Var.f29520b = 1;
                    objM4 = rz.e0.M(eVar3, g2Var4, v0Var);
                    if (objM4 != aVar22) {
                    }
                    r13 = r21;
                    return aVar22;
                }
                if (i60 != 1) {
                    if (i60 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM4);
                    return b0Var2;
                }
                i15 = v0Var.f29523e;
                uz.j jVar4 = v0Var.f29522d;
                com.bumptech.glide.e.F(objM4);
                r13 = jVar4;
                r13 = r21;
                v0Var.f29522d = null;
                v0Var.f29523e = i15;
                v0Var.f29520b = 2;
                if (r13.emit(objM4, v0Var) != aVar22) {
                    return b0Var2;
                }
                r13 = r21;
                return aVar22;
            case 22:
                if (dVar instanceof gp.w0) {
                    w0Var = (gp.w0) dVar;
                    int i61 = w0Var.f29532b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        w0Var.f29532b = i61 - Integer.MIN_VALUE;
                    } else {
                        w0Var = new gp.w0(this, dVar);
                    }
                } else {
                    w0Var = new gp.w0(this, dVar);
                }
                Object objM5 = w0Var.f29531a;
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                int i62 = w0Var.f29532b;
                if (i62 == 0) {
                    com.bumptech.glide.e.F(objM5);
                    yz.f fVar5 = rz.o0.f50940a;
                    yz.e eVar4 = yz.e.f58387a;
                    g2 g2Var5 = new g2(i14, 23, AsExternalModel);
                    w0Var.f29534d = r21;
                    w0Var.f29535e = 0;
                    w0Var.f29532b = 1;
                    objM5 = rz.e0.M(eVar4, g2Var5, w0Var);
                    if (objM5 != aVar23) {
                    }
                    r14 = r21;
                    return aVar23;
                }
                if (i62 != 1) {
                    if (i62 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM5);
                    return b0Var2;
                }
                i15 = w0Var.f29535e;
                uz.j jVar5 = w0Var.f29534d;
                com.bumptech.glide.e.F(objM5);
                r14 = jVar5;
                r14 = r21;
                w0Var.f29534d = null;
                w0Var.f29535e = i15;
                w0Var.f29532b = 2;
                if (r14.emit(objM5, w0Var) != aVar23) {
                    return b0Var2;
                }
                r14 = r21;
                return aVar23;
            case 23:
                if (dVar instanceof gp.x0) {
                    x0Var = (gp.x0) dVar;
                    int i63 = x0Var.f29543b;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        x0Var.f29543b = i63 - Integer.MIN_VALUE;
                    } else {
                        x0Var = new gp.x0(this, dVar);
                    }
                } else {
                    x0Var = new gp.x0(this, dVar);
                }
                Object objM6 = x0Var.f29542a;
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                int i64 = x0Var.f29543b;
                if (i64 == 0) {
                    com.bumptech.glide.e.F(objM6);
                    yz.f fVar6 = rz.o0.f50940a;
                    yz.e eVar5 = yz.e.f58387a;
                    g2 g2Var6 = new g2(i14, 24, AsExternalModel);
                    x0Var.f29545d = r21;
                    x0Var.f29546e = 0;
                    x0Var.f29543b = 1;
                    objM6 = rz.e0.M(eVar5, g2Var6, x0Var);
                    if (objM6 != aVar24) {
                    }
                    r15 = r21;
                    return aVar24;
                }
                if (i64 != 1) {
                    if (i64 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM6);
                    return b0Var2;
                }
                i15 = x0Var.f29546e;
                uz.j jVar6 = x0Var.f29545d;
                com.bumptech.glide.e.F(objM6);
                r15 = jVar6;
                r15 = r21;
                x0Var.f29545d = null;
                x0Var.f29546e = i15;
                x0Var.f29543b = 2;
                if (r15.emit(objM6, x0Var) != aVar24) {
                    return b0Var2;
                }
                r15 = r21;
                return aVar24;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                if (dVar instanceof gp.y0) {
                    y0Var = (gp.y0) dVar;
                    int i65 = y0Var.f29554b;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        y0Var.f29554b = i65 - Integer.MIN_VALUE;
                    } else {
                        y0Var = new gp.y0(this, dVar);
                    }
                } else {
                    y0Var = new gp.y0(this, dVar);
                }
                Object objM7 = y0Var.f29553a;
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                int i66 = y0Var.f29554b;
                if (i66 == 0) {
                    com.bumptech.glide.e.F(objM7);
                    yz.f fVar7 = rz.o0.f50940a;
                    yz.e eVar6 = yz.e.f58387a;
                    g2 g2Var7 = new g2(i14, 11, AsExternalModel);
                    y0Var.f29556d = r21;
                    y0Var.f29557e = 0;
                    y0Var.f29554b = 1;
                    objM7 = rz.e0.M(eVar6, g2Var7, y0Var);
                    if (objM7 != aVar25) {
                    }
                    r16 = r21;
                    return aVar25;
                }
                if (i66 != 1) {
                    if (i66 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM7);
                    return b0Var2;
                }
                i15 = y0Var.f29557e;
                uz.j jVar7 = y0Var.f29556d;
                com.bumptech.glide.e.F(objM7);
                r16 = jVar7;
                r16 = r21;
                y0Var.f29556d = null;
                y0Var.f29557e = i15;
                y0Var.f29554b = 2;
                if (r16.emit(objM7, y0Var) != aVar25) {
                    return b0Var2;
                }
                r16 = r21;
                return aVar25;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                if (dVar instanceof gp.z0) {
                    z0Var = (gp.z0) dVar;
                    int i67 = z0Var.f29560b;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        z0Var.f29560b = i67 - Integer.MIN_VALUE;
                    } else {
                        z0Var = new gp.z0(this, dVar);
                    }
                } else {
                    z0Var = new gp.z0(this, dVar);
                }
                Object objM8 = z0Var.f29559a;
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                int i68 = z0Var.f29560b;
                if (i68 == 0) {
                    com.bumptech.glide.e.F(objM8);
                    yz.f fVar8 = rz.o0.f50940a;
                    yz.e eVar7 = yz.e.f58387a;
                    g2 g2Var8 = new g2(i14, 19, AsExternalModel);
                    z0Var.f29562d = r21;
                    z0Var.f29563e = 0;
                    z0Var.f29560b = 1;
                    objM8 = rz.e0.M(eVar7, g2Var8, z0Var);
                    if (objM8 != aVar26) {
                    }
                    r17 = r21;
                    return aVar26;
                }
                if (i68 != 1) {
                    if (i68 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM8);
                    return b0Var2;
                }
                i15 = z0Var.f29563e;
                uz.j jVar8 = z0Var.f29562d;
                com.bumptech.glide.e.F(objM8);
                r17 = jVar8;
                r17 = r21;
                z0Var.f29562d = null;
                z0Var.f29563e = i15;
                z0Var.f29560b = 2;
                if (r17.emit(objM8, z0Var) != aVar26) {
                    return b0Var2;
                }
                r17 = r21;
                return aVar26;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                if (dVar instanceof gp.a1) {
                    a1Var = (gp.a1) dVar;
                    int i69 = a1Var.f29335b;
                    if ((i69 & Integer.MIN_VALUE) != 0) {
                        a1Var.f29335b = i69 - Integer.MIN_VALUE;
                    } else {
                        a1Var = new gp.a1(this, dVar);
                    }
                } else {
                    a1Var = new gp.a1(this, dVar);
                }
                Object objM9 = a1Var.f29334a;
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                int i70 = a1Var.f29335b;
                if (i70 == 0) {
                    com.bumptech.glide.e.F(objM9);
                    yz.f fVar9 = rz.o0.f50940a;
                    yz.e eVar8 = yz.e.f58387a;
                    g2 g2Var9 = new g2(i14, i12, AsExternalModel);
                    a1Var.f29337d = r21;
                    a1Var.f29338e = 0;
                    a1Var.f29335b = 1;
                    objM9 = rz.e0.M(eVar8, g2Var9, a1Var);
                    if (objM9 != aVar27) {
                    }
                    r18 = r21;
                    return aVar27;
                }
                if (i70 != 1) {
                    if (i70 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM9);
                    return b0Var2;
                }
                i15 = a1Var.f29338e;
                uz.j jVar9 = a1Var.f29337d;
                com.bumptech.glide.e.F(objM9);
                r18 = jVar9;
                r18 = r21;
                a1Var.f29337d = null;
                a1Var.f29338e = i15;
                a1Var.f29335b = 2;
                if (r18.emit(objM9, a1Var) != aVar27) {
                    return b0Var2;
                }
                r18 = r21;
                return aVar27;
            case 27:
                return a(obj, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return b(obj, dVar);
            default:
                if (dVar instanceof gp.e1) {
                    e1Var = (gp.e1) dVar;
                    int i71 = e1Var.f29367b;
                    if ((i71 & Integer.MIN_VALUE) != 0) {
                        e1Var.f29367b = i71 - Integer.MIN_VALUE;
                    } else {
                        e1Var = new gp.e1(this, dVar);
                    }
                } else {
                    e1Var = new gp.e1(this, dVar);
                }
                Object objM10 = e1Var.f29366a;
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                int i72 = e1Var.f29367b;
                if (i72 == 0) {
                    com.bumptech.glide.e.F(objM10);
                    e1Var.f29369d = r21;
                    e1Var.f29370e = 0;
                    e1Var.f29367b = 1;
                    objM10 = rz.e0.M(rz.o0.f50940a, new g2(i14, 14, AsExternalModel), e1Var);
                    if (objM10 != aVar28) {
                    }
                    r19 = r21;
                    return aVar28;
                }
                if (i72 != 1) {
                    if (i72 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM10);
                    return b0Var2;
                }
                i15 = e1Var.f29370e;
                uz.j jVar10 = e1Var.f29369d;
                com.bumptech.glide.e.F(objM10);
                r19 = jVar10;
                r19 = r21;
                e1Var.f29369d = null;
                e1Var.f29370e = i15;
                e1Var.f29367b = 2;
                if (r19.emit(objM10, e1Var) != aVar28) {
                    return b0Var2;
                }
                r19 = r21;
                return aVar28;
        }
    }

    public /* synthetic */ e0(uz.j jVar, ViewModel viewModel, int i11) {
        this.f4197a = i11;
        this.f4198b = jVar;
    }
}
