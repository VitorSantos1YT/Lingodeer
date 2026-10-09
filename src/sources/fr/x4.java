package fr;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingodeer.data.model.BillingStatus;
import com.lingodeer.data.model.BillingStatusKt;
import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.data.model.LessonTestProgress;
import com.lingodeer.data.model.ProgressCollectionItem;
import com.lingodeer.data.model.UserInfo;
import com.lingodeer.database.UserDataDatabase;
import com.lingodeer.database.model.SubLearnProgressEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements vt.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDataDatabase f27968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.k0 f27969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f27970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dv.u0 f27971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ur.a f27972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gq.k f27973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uz.i f27974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UserInfo f27975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a00.e f27977j;

    public x4(UserDataDatabase userDataDatabase, vt.c cVar, vt.k0 k0Var, vt.n0 n0Var, dv.u0 u0Var, ur.a aVar, gq.k kVar) {
        this.f27968a = userDataDatabase;
        this.f27969b = k0Var;
        this.f27970c = n0Var;
        this.f27971d = u0Var;
        this.f27972e = aVar;
        this.f27973f = kVar;
        this.f27974g = uz.x0.o(new no.g(((vt.d) cVar).f54198h, userDataDatabase.z().a(), new f4(this, (vy.d) null, 0)));
        new w4(this, null);
        this.f27976i = true;
        this.f27977j = new a00.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(x4 x4Var, gq.w wVar, boolean z11, xy.c cVar) throws Throwable {
        t3 t3Var;
        boolean z12;
        gq.c0 c0Var;
        x4Var.getClass();
        if (cVar instanceof t3) {
            t3Var = (t3) cVar;
            int i11 = t3Var.f27865e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t3Var.f27865e = i11 - Integer.MIN_VALUE;
            } else {
                t3Var = new t3(x4Var, cVar);
            }
        } else {
            t3Var = new t3(x4Var, cVar);
        }
        Object objO = t3Var.f27863c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = t3Var.f27865e;
        boolean z13 = true;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objO);
            if (wVar == null) {
                return Boolean.TRUE;
            }
            rz.t tVar = wVar.f29651d;
            t3Var.f27861a = wVar;
            t3Var.f27862b = z11;
            t3Var.f27865e = 1;
            if (tVar.o(t3Var) != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            z11 = t3Var.f27862b;
            wVar = t3Var.f27861a;
            com.bumptech.glide.e.F(objO);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = t3Var.f27862b;
            com.bumptech.glide.e.F(objO);
        }
        gq.v vVar = (gq.v) objO;
        if (z12 && (c0Var = vVar.f29646c) != gq.c0.SUCCESS && c0Var != gq.c0.SUPERSEDED) {
            z13 = false;
        }
        return Boolean.valueOf(z13);
        rz.t tVar2 = wVar.f29650c;
        t3Var.f27861a = null;
        t3Var.f27862b = z11;
        t3Var.f27865e = 2;
        objO = tVar2.o(t3Var);
        if (objO != aVar) {
            z12 = z11;
            gq.v vVar2 = (gq.v) objO;
            if (z12) {
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(x4 x4Var, int i11, xy.c cVar) {
        a4 a4Var;
        int i12;
        if (cVar instanceof a4) {
            a4Var = (a4) cVar;
            int i13 = a4Var.f27399d;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                a4Var.f27399d = i13 - Integer.MIN_VALUE;
            } else {
                a4Var = new a4(x4Var, cVar);
            }
        } else {
            a4Var = new a4(x4Var, cVar);
        }
        Object obj = a4Var.f27397b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i14 = a4Var.f27399d;
        if (i14 == 0) {
            com.bumptech.glide.e.F(obj);
            au.k0 k0VarF = x4Var.f27968a.F();
            String strB = ks.f.b();
            a4Var.f27396a = i11;
            a4Var.f27399d = 1;
            Object objB = cf.x.B(k0VarF.f3036a, new au.e0(k0VarF, strB, i11, null, 1), a4Var);
            if (objB != obj2) {
                objB = qy.b0.f48488a;
            }
            if (objB == obj2) {
                return obj2;
            }
            i12 = i11;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = a4Var.f27396a;
            com.bumptech.glide.e.F(obj);
        }
        return new Integer(i12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(x4 x4Var, int i11, xy.c cVar) {
        b4 b4Var;
        int i12;
        if (cVar instanceof b4) {
            b4Var = (b4) cVar;
            int i13 = b4Var.f27422d;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                b4Var.f27422d = i13 - Integer.MIN_VALUE;
            } else {
                b4Var = new b4(x4Var, cVar);
            }
        } else {
            b4Var = new b4(x4Var, cVar);
        }
        Object obj = b4Var.f27420b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i14 = b4Var.f27422d;
        if (i14 == 0) {
            com.bumptech.glide.e.F(obj);
            au.f0 f0VarE = x4Var.f27968a.E();
            String strB = ks.f.b();
            b4Var.f27419a = i11;
            b4Var.f27422d = 1;
            Object objB = cf.x.B(f0VarE.f2988a, new au.e0(f0VarE, strB, i11, null, 0), b4Var);
            if (objB != obj2) {
                objB = qy.b0.f48488a;
            }
            if (objB == obj2) {
                return obj2;
            }
            i12 = i11;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = b4Var.f27419a;
            com.bumptech.glide.e.F(obj);
        }
        return new Integer(i12);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (r12 == r2) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(fr.x4 r11, xy.c r12) {
        /*
            vt.n0 r0 = r11.f27970c
            boolean r1 = r12 instanceof fr.j4
            if (r1 == 0) goto L15
            r1 = r12
            fr.j4 r1 = (fr.j4) r1
            int r2 = r1.f27638c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f27638c = r2
            goto L1a
        L15:
            fr.j4 r1 = new fr.j4
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.f27636a
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r1.f27638c
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            qy.b0 r8 = qy.b0.f48488a
            r9 = 0
            if (r3 == 0) goto L4a
            if (r3 == r7) goto L46
            if (r3 == r6) goto L42
            if (r3 == r5) goto L3e
            if (r3 != r4) goto L36
            com.bumptech.glide.e.F(r12)
            goto La5
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            com.bumptech.glide.e.F(r12)
            goto L8d
        L42:
            com.bumptech.glide.e.F(r12)
            goto L6e
        L46:
            com.bumptech.glide.e.F(r12)
            goto L65
        L4a:
            com.bumptech.glide.e.F(r12)
            r1.f27638c = r7
            yz.f r12 = rz.o0.f50940a
            yz.e r12 = yz.e.f58387a
            b0.x0 r3 = new b0.x0
            r10 = 9
            r3.<init>(r11, r9, r10)
            java.lang.Object r12 = rz.e0.M(r12, r3, r1)
            if (r12 != r2) goto L61
            goto L62
        L61:
            r12 = r8
        L62:
            if (r12 != r2) goto L65
            goto La4
        L65:
            r1.f27638c = r6
            java.lang.Object r12 = r11.l(r1)
            if (r12 != r2) goto L6e
            goto La4
        L6e:
            com.lingodeer.database.UserDataDatabase r12 = r11.f27968a
            r12.d()
            r1.f27638c = r5
            r12 = r0
            fr.o0 r12 = (fr.o0) r12
            yz.f r3 = rz.o0.f50940a
            yz.e r3 = yz.e.f58387a
            fr.g0 r5 = new fr.g0
            r6 = 0
            r5.<init>(r6, r12, r9)
            java.lang.Object r12 = rz.e0.M(r3, r5, r1)
            if (r12 != r2) goto L89
            goto L8a
        L89:
            r12 = r8
        L8a:
            if (r12 != r2) goto L8d
            goto La4
        L8d:
            r1.f27638c = r4
            fr.o0 r0 = (fr.o0) r0
            yz.f r12 = rz.o0.f50940a
            yz.e r12 = yz.e.f58387a
            fr.g0 r3 = new fr.g0
            r3.<init>(r7, r0, r9)
            java.lang.Object r12 = rz.e0.M(r12, r3, r1)
            if (r12 != r2) goto La1
            goto La2
        La1:
            r12 = r8
        La2:
            if (r12 != r2) goto La5
        La4:
            return r2
        La5:
            vt.k0 r11 = r11.f27969b
            bh.a1 r11 = (bh.a1) r11
            r11.f4151e = r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.x4.e(fr.x4, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object f(x4 x4Var, List list, List list2, xy.c cVar) {
        k4 k4Var;
        int i11;
        Iterator it;
        x4Var.getClass();
        if (cVar instanceof k4) {
            k4Var = (k4) cVar;
            int i12 = k4Var.f27657e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                k4Var.f27657e = i12 - Integer.MIN_VALUE;
            } else {
                k4Var = new k4(x4Var, cVar);
            }
        } else {
            k4Var = new k4(x4Var, cVar);
        }
        Object obj = k4Var.f27655c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = k4Var.f27657e;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            List list3 = list2;
            if (list3.contains("all")) {
                list3 = null;
            }
            Set setF1 = list3 != null ? ry.m.f1(list3) : null;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ProgressCollectionItem progressCollectionItem = (ProgressCollectionItem) obj2;
                if (setF1 == null || setF1.contains(progressCollectionItem.getLan())) {
                    arrayList.add(obj2);
                }
            }
            i11 = 0;
            it = arrayList.iterator();
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = k4Var.f27654b;
            it = k4Var.f27653a;
            com.bumptech.glide.e.F(obj);
        }
        while (it.hasNext()) {
            ProgressCollectionItem progressCollectionItem2 = (ProgressCollectionItem) it.next();
            vt.k0 k0Var = x4Var.f27969b;
            LearnProgress learnProgressCopy$default = LearnProgress.copy$default(new LearnProgress(progressCollectionItem2.getLan()), null, progressCollectionItem2.getMain(), progressCollectionItem2.getMainTT(), progressCollectionItem2.getLessonExam(), progressCollectionItem2.getLessonStars(), null, progressCollectionItem2.getPronun(), progressCollectionItem2.getRestartTimestamp(), 0L, 0, 0, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, false, 2147483425, null);
            k4Var.f27653a = it;
            k4Var.f27654b = i11;
            k4Var.f27657e = 1;
            if (((bh.a1) k0Var).i(learnProgressCopy$default, true, k4Var) == aVar) {
                return aVar;
            }
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r11 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(fr.x4 r9, boolean r10, xy.c r11) {
        /*
            vt.n0 r0 = r9.f27970c
            boolean r1 = r11 instanceof fr.n4
            if (r1 == 0) goto L15
            r1 = r11
            fr.n4 r1 = (fr.n4) r1
            int r2 = r1.f27729e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f27729e = r2
            goto L1a
        L15:
            fr.n4 r1 = new fr.n4
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.f27727c
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r1.f27729e
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            com.bumptech.glide.e.F(r11)     // Catch: java.lang.Throwable -> Lb1
            goto Lae
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            boolean r10 = r1.f27725a
            com.lingodeer.database.model.SubLearnProgressEntity r3 = r1.f27726b
            com.bumptech.glide.e.F(r11)
            goto L83
        L3d:
            com.bumptech.glide.e.F(r11)
            if (r10 != 0) goto L63
            r11 = r0
            fr.o0 r11 = (fr.o0) r11
            com.lingodeer.data.env.Env r11 = r11.f27733a
            int r11 = r11.keyLanguage
            r3 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3, r6}
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = ry.l.D(r3, r11)
            if (r11 != 0) goto L63
            goto Lc5
        L63:
            com.lingodeer.database.model.SubLearnProgressEntity r3 = new com.lingodeer.database.model.SubLearnProgressEntity
            java.lang.String r11 = ""
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "cn_tone"
            r3.<init>(r8, r11, r6)
            com.lingodeer.database.UserDataDatabase r11 = r9.f27968a
            au.e1 r11 = r11.T()
            r1.f27726b = r3
            r1.f27725a = r10
            r1.f27729e = r5
            java.lang.Object r11 = r11.a(r3, r1)
            if (r11 != r2) goto L83
            goto Lad
        L83:
            dv.u0 r9 = r9.f27971d     // Catch: java.lang.Throwable -> Lb1
            fr.o0 r0 = (fr.o0) r0     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r11 = r0.w()     // Catch: java.lang.Throwable -> Lb1
            com.lingodeer.data.model.SubCourseProgressCollectionItem r0 = new com.lingodeer.data.model.SubCourseProgressCollectionItem     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = r3.getId()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r6 = r3.getProgress()     // Catch: java.lang.Throwable -> Lb1
            long r7 = r3.getTime()     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> Lb1
            java.util.List r0 = ns.o.K(r0)     // Catch: java.lang.Throwable -> Lb1
            r3 = 0
            r1.f27726b = r3     // Catch: java.lang.Throwable -> Lb1
            r1.f27725a = r10     // Catch: java.lang.Throwable -> Lb1
            r1.f27729e = r4     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r11 = r9.r(r11, r0, r1)     // Catch: java.lang.Throwable -> Lb1
            if (r11 != r2) goto Lae
        Lad:
            return r2
        Lae:
            com.lingodeer.network.model.ApiResponse r11 = (com.lingodeer.network.model.ApiResponse) r11     // Catch: java.lang.Throwable -> Lb1
            goto Lb6
        Lb1:
            r9 = move-exception
            qy.n r11 = com.bumptech.glide.e.l(r9)
        Lb6:
            boolean r9 = r11 instanceof qy.n
            if (r9 != 0) goto Lc5
            com.lingodeer.network.model.ApiResponse r11 = (com.lingodeer.network.model.ApiResponse) r11
            boolean r9 = r11 instanceof com.lingodeer.network.model.ApiResponse.Error
            if (r9 == 0) goto Lc5
            com.lingodeer.network.model.ApiResponse$Error r11 = (com.lingodeer.network.model.ApiResponse.Error) r11
            r11.getMessage()
        Lc5:
            qy.b0 r9 = qy.b0.f48488a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.x4.g(fr.x4, boolean, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0377  */
    /* JADX WARN: Code duplicated, block: B:103:0x037b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e9 A[LOOP:2: B:57:0x01e7->B:58:0x01e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0229  */
    /* JADX WARN: Code duplicated, block: B:66:0x0230  */
    /* JADX WARN: Code duplicated, block: B:67:0x0232  */
    /* JADX WARN: Code duplicated, block: B:72:0x0247  */
    /* JADX WARN: Code duplicated, block: B:78:0x0278  */
    /* JADX WARN: Code duplicated, block: B:80:0x029b  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Code duplicated, block: B:90:0x0302  */
    /* JADX WARN: Code duplicated, block: B:92:0x0306  */
    /* JADX WARN: Code duplicated, block: B:94:0x0326  */
    /* JADX WARN: Code duplicated, block: B:96:0x033c A[LOOP:0: B:95:0x033a->B:96:0x033c, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x022a, code lost:
    
        if (r6 == r1) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.List, kotlin.jvm.internal.f, vy.d] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(fr.x4 r38, xy.c r39) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.x4.h(fr.x4, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r1.g(r6, r7, r2) == r8) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(fr.x4 r6, com.lingodeer.data.model.UserInfo r7, xy.c r8) {
        /*
            vt.n0 r0 = r6.f27970c
            dv.u0 r1 = r6.f27971d
            boolean r2 = r8 instanceof fr.v4
            if (r2 == 0) goto L17
            r2 = r8
            fr.v4 r2 = (fr.v4) r2
            int r3 = r2.f27928d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f27928d = r3
            goto L1c
        L17:
            fr.v4 r2 = new fr.v4
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r2.f27926b
            wy.a r8 = wy.a.COROUTINE_SUSPENDED
            int r3 = r2.f27928d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            com.bumptech.glide.e.F(r6)
            goto L6b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            com.lingodeer.data.model.UserInfo r7 = r2.f27925a
            com.bumptech.glide.e.F(r6)
            goto L55
        L3c:
            com.bumptech.glide.e.F(r6)
            r6 = r0
            fr.o0 r6 = (fr.o0) r6
            java.lang.String r6 = r6.w()
            java.lang.String r3 = r7.getSkillMastery()
            r2.f27925a = r7
            r2.f27928d = r5
            java.lang.Object r6 = r1.n(r6, r3, r2)
            if (r6 != r8) goto L55
            goto L6a
        L55:
            fr.o0 r0 = (fr.o0) r0
            java.lang.String r6 = r0.w()
            java.lang.String r7 = r7.getAchievementLanguages()
            r0 = 0
            r2.f27925a = r0
            r2.f27928d = r4
            java.lang.Object r6 = r1.g(r6, r7, r2)
            if (r6 != r8) goto L6b
        L6a:
            return r8
        L6b:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.x4.i(fr.x4, com.lingodeer.data.model.UserInfo, xy.c):java.lang.Object");
    }

    public final uz.i j() {
        bh.r rVar = new bh.r(this.f27974g, this, 4);
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(rVar, yz.e.f58387a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[PHI: r2 r14
      0x00c7: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v14 java.lang.String) binds: [B:40:0x00c3, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r14v3 int) = (r14v2 int), (r14v12 int) binds: [B:40:0x00c3, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(int i11, xy.c cVar) {
        w3 w3Var;
        String str;
        Object objC;
        Object objC2;
        Object objC3;
        if (cVar instanceof w3) {
            w3Var = (w3) cVar;
            int i12 = w3Var.f27953e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                w3Var.f27953e = i12 - Integer.MIN_VALUE;
            } else {
                w3Var = new w3(this, cVar);
            }
        } else {
            w3Var = new w3(this, cVar);
        }
        Object obj = w3Var.f27951c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = w3Var.f27953e;
        UserDataDatabase userDataDatabase = this.f27968a;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            String strK = xt.d.k(i11);
            au.t0 t0VarN = userDataDatabase.N();
            w3Var.f27950b = strK;
            w3Var.f27949a = i11;
            w3Var.f27953e = 1;
            Object objC4 = cf.x.C(w3Var, t0VarN.f3072a, false, true, new au.f(strK, 15));
            if (objC4 != aVar) {
                objC4 = b0Var;
            }
            if (objC4 != aVar) {
                str = strK;
            }
            return aVar;
        }
        if (i13 == 1) {
            i11 = w3Var.f27949a;
            str = w3Var.f27950b;
            com.bumptech.glide.e.F(obj);
        } else {
            if (i13 == 2) {
                i11 = w3Var.f27949a;
                str = w3Var.f27950b;
                com.bumptech.glide.e.F(obj);
                au.f1 f1VarU = userDataDatabase.U();
                w3Var.f27950b = str;
                w3Var.f27949a = i11;
                w3Var.f27953e = 3;
                objC = cf.x.C(w3Var, f1VarU.f2991a, false, true, new au.f(str, 25));
                if (objC != aVar) {
                    objC = b0Var;
                }
                if (objC != aVar) {
                    String strConcat = oz.x.q0(xt.d.p(i11), "_", "\\_").concat("%");
                    au.z0 z0VarR = userDataDatabase.R();
                    w3Var.f27950b = str;
                    w3Var.f27949a = i11;
                    w3Var.f27953e = 4;
                    objC2 = cf.x.C(w3Var, z0VarR.f3103a, false, true, new au.f(strConcat, 20));
                    if (objC2 != aVar) {
                        objC2 = b0Var;
                    }
                    if (objC2 != aVar) {
                    }
                }
                return aVar;
            }
            if (i13 == 3) {
                i11 = w3Var.f27949a;
                str = w3Var.f27950b;
                com.bumptech.glide.e.F(obj);
                String strConcat2 = oz.x.q0(xt.d.p(i11), "_", "\\_").concat("%");
                au.z0 z0VarR2 = userDataDatabase.R();
                w3Var.f27950b = str;
                w3Var.f27949a = i11;
                w3Var.f27953e = 4;
                objC2 = cf.x.C(w3Var, z0VarR2.f3103a, false, true, new au.f(strConcat2, 20));
                if (objC2 != aVar) {
                    objC2 = b0Var;
                }
                if (objC2 != aVar) {
                }
                return aVar;
            }
            if (i13 != 4) {
                if (i13 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            }
            i11 = w3Var.f27949a;
            str = w3Var.f27950b;
            com.bumptech.glide.e.F(obj);
        }
        au.c1 c1VarS = userDataDatabase.S();
        List listK = ns.o.K(str);
        w3Var.f27950b = null;
        w3Var.f27949a = i11;
        w3Var.f27953e = 5;
        c1VarS.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM srs_status WHERE lan IN (");
        ew.a.i(listK.size(), sb2);
        sb2.append(")");
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        objC3 = cf.x.C(w3Var, c1VarS.f2964a, false, true, new au.n(6, string, listK));
        if (objC3 != aVar) {
            objC3 = b0Var;
        }
        if (objC3 != aVar) {
            return aVar;
        }
        return b0Var;
        au.u0 u0VarO = userDataDatabase.O();
        w3Var.f27950b = str;
        w3Var.f27949a = i11;
        w3Var.f27953e = 2;
        Object objC5 = cf.x.C(w3Var, u0VarO.f3075a, false, true, new au.f(str, 17));
        if (objC5 != aVar) {
            objC5 = b0Var;
        }
        if (objC5 != aVar) {
            au.f1 f1VarU2 = userDataDatabase.U();
            w3Var.f27950b = str;
            w3Var.f27949a = i11;
            w3Var.f27953e = 3;
            objC = cf.x.C(w3Var, f1VarU2.f2991a, false, true, new au.f(str, 25));
            if (objC != aVar) {
                objC = b0Var;
            }
            if (objC != aVar) {
                String strConcat3 = oz.x.q0(xt.d.p(i11), "_", "\\_").concat("%");
                au.z0 z0VarR3 = userDataDatabase.R();
                w3Var.f27950b = str;
                w3Var.f27949a = i11;
                w3Var.f27953e = 4;
                objC2 = cf.x.C(w3Var, z0VarR3.f3103a, false, true, new au.f(strConcat3, 20));
                if (objC2 != aVar) {
                    objC2 = b0Var;
                }
                if (objC2 != aVar) {
                    au.c1 c1VarS2 = userDataDatabase.S();
                    List listK2 = ns.o.K(str);
                    w3Var.f27950b = null;
                    w3Var.f27949a = i11;
                    w3Var.f27953e = 5;
                    c1VarS2.getClass();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("DELETE FROM srs_status WHERE lan IN (");
                    ew.a.i(listK2.size(), sb3);
                    sb3.append(")");
                    String string2 = sb3.toString();
                    kotlin.jvm.internal.m.e(string2, "toString(...)");
                    objC3 = cf.x.C(w3Var, c1VarS2.f2964a, false, true, new au.n(6, string2, listK2));
                    if (objC3 != aVar) {
                        objC3 = b0Var;
                    }
                    if (objC3 != aVar) {
                        return b0Var;
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(xy.c cVar) {
        x3 x3Var;
        a00.e eVar;
        if (cVar instanceof x3) {
            x3Var = (x3) cVar;
            int i11 = x3Var.f27967d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x3Var.f27967d = i11 - Integer.MIN_VALUE;
            } else {
                x3Var = new x3(this, cVar);
            }
        } else {
            x3Var = new x3(this, cVar);
        }
        Object obj = x3Var.f27965b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = x3Var.f27967d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            a00.e eVar2 = this.f27977j;
            x3Var.f27964a = eVar2;
            x3Var.f27967d = 1;
            if (eVar2.b(x3Var) == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = x3Var.f27964a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            this.f27975h = null;
            this.f27976i = true;
            return qy.b0.f48488a;
        } finally {
            eVar.a(null);
        }
    }

    public final d4 m(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        au.v0 v0VarP = this.f27968a.P();
        v0VarP.getClass();
        return new d4(qx.p.l(v0VarP.f3078a, new String[]{"lesson_test_progress"}, new au.f(id2, 18)), id2, 1);
    }

    public final gp.r n() {
        return new gp.r(new h4(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(xy.c cVar) {
        i4 i4Var;
        if (cVar instanceof i4) {
            i4Var = (i4) cVar;
            int i11 = i4Var.f27616c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i4Var.f27616c = i11 - Integer.MIN_VALUE;
            } else {
                i4Var = new i4(this, cVar);
            }
        } else {
            i4Var = new i4(this, cVar);
        }
        Object objM = i4Var.f27614a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = i4Var.f27616c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            UserInfo userInfo = this.f27975h;
            if (userInfo != null && !this.f27976i) {
                return userInfo;
            }
            i4Var.f27616c = 1;
            yz.f fVar = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new e6.q0(this, null, 19), i4Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        this.f27975h = (UserInfo) objM;
        this.f27976i = false;
        return objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(UserInfo userInfo, xy.c cVar) throws Throwable {
        o4 o4Var;
        a00.a aVar;
        int i11;
        Throwable th2;
        a00.a aVar2;
        if (cVar instanceof o4) {
            o4Var = (o4) cVar;
            int i12 = o4Var.f27766f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                o4Var.f27766f = i12 - Integer.MIN_VALUE;
            } else {
                o4Var = new o4(this, cVar);
            }
        } else {
            o4Var = new o4(this, cVar);
        }
        Object obj = o4Var.f27764d;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i13 = o4Var.f27766f;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(obj);
                o4Var.f27761a = userInfo;
                aVar = this.f27977j;
                o4Var.f27762b = aVar;
                i11 = 0;
                o4Var.f27763c = 0;
                o4Var.f27766f = 1;
                if (aVar.b(o4Var) != obj2) {
                }
                return obj2;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = o4Var.f27762b;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar2.a(null);
                    return qy.b0.f48488a;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.a(null);
                    throw th2;
                }
            }
            int i14 = o4Var.f27763c;
            a00.a aVar3 = o4Var.f27762b;
            UserInfo userInfo2 = o4Var.f27761a;
            com.bumptech.glide.e.F(obj);
            aVar = aVar3;
            i11 = i14;
            userInfo = userInfo2;
            o4Var.f27761a = null;
            o4Var.f27762b = aVar;
            o4Var.f27763c = i11;
            o4Var.f27766f = 2;
            if (r(userInfo, o4Var) != obj2) {
                aVar2 = aVar;
                aVar2.a(null);
                return qy.b0.f48488a;
            }
            return obj2;
        } catch (Throwable th4) {
            a00.a aVar4 = aVar;
            th2 = th4;
            aVar2 = aVar4;
            aVar2.a(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(UserInfo userInfo, xy.c cVar) {
        p4 p4Var;
        if (cVar instanceof p4) {
            p4Var = (p4) cVar;
            int i11 = p4Var.f27782d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p4Var.f27782d = i11 - Integer.MIN_VALUE;
            } else {
                p4Var = new p4(this, cVar);
            }
        } else {
            p4Var = new p4(this, cVar);
        }
        Object obj = p4Var.f27780b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = p4Var.f27782d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            Objects.toString(userInfo);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            e6.q0 q0Var = new e6.q0(20, this, userInfo, (vy.d) null);
            p4Var.f27779a = userInfo;
            p4Var.f27782d = 1;
            if (rz.e0.M(eVar, q0Var, p4Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userInfo = p4Var.f27779a;
            com.bumptech.glide.e.F(obj);
        }
        this.f27975h = userInfo;
        this.f27976i = false;
        return qy.b0.f48488a;
    }

    public final Object s(BillingStatus billingStatus, xy.i iVar) {
        Objects.toString(billingStatus);
        au.d dVarZ = this.f27968a.z();
        Object objC = cf.x.C(iVar, dVarZ.f2966a, false, true, new au.b(0, dVarZ, BillingStatusKt.asEntityModel(billingStatus)));
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? objC : b0Var;
    }

    public final Object t(LessonTestProgress lessonTestProgress, wt.n0 n0Var) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new e6.q0(22, this, lessonTestProgress, (vy.d) null), n0Var);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(fz.c cVar, vy.d dVar) throws Throwable {
        t4 t4Var;
        a00.a aVar;
        int i11;
        int i12;
        fz.c cVar2;
        int i13;
        a00.a aVar2;
        UserInfo userInfo;
        UserInfo userInfo2;
        if (dVar instanceof t4) {
            t4Var = (t4) dVar;
            int i14 = t4Var.H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t4Var.H = i14 - Integer.MIN_VALUE;
            } else {
                t4Var = new t4(this, dVar);
            }
        } else {
            t4Var = new t4(this, dVar);
        }
        Object obj = t4Var.f27871f;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i15 = t4Var.H;
        try {
            if (i15 == 0) {
                com.bumptech.glide.e.F(obj);
                t4Var.f27866a = cVar;
                a00.e eVar = this.f27977j;
                t4Var.f27867b = eVar;
                t4Var.f27869d = 0;
                t4Var.H = 1;
                if (eVar.b(t4Var) != obj2) {
                    aVar = eVar;
                    i11 = 0;
                }
                return obj2;
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    int i16 = t4Var.f27870e;
                    i13 = t4Var.f27869d;
                    fz.c cVar3 = (fz.c) t4Var.f27868c;
                    a00.a aVar3 = t4Var.f27867b;
                    try {
                        com.bumptech.glide.e.F(obj);
                        i12 = i16;
                        cVar2 = cVar3;
                        aVar = aVar3;
                        int i17 = i12;
                        userInfo = (UserInfo) cVar2.invoke(obj);
                        t4Var.f27866a = null;
                        t4Var.f27867b = aVar;
                        t4Var.f27868c = userInfo;
                        t4Var.f27869d = i13;
                        t4Var.f27870e = i17;
                        t4Var.H = 3;
                        if (r(userInfo, t4Var) != obj2) {
                            userInfo2 = userInfo;
                            aVar2 = aVar;
                        }
                        return obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar3;
                    }
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    userInfo2 = (UserInfo) t4Var.f27868c;
                    aVar2 = t4Var.f27867b;
                    try {
                        com.bumptech.glide.e.F(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                aVar2.a(null);
                throw th;
            }
            int i18 = t4Var.f27869d;
            aVar = t4Var.f27867b;
            fz.c cVar4 = t4Var.f27866a;
            com.bumptech.glide.e.F(obj);
            i11 = i18;
            cVar = cVar4;
            aVar2.a(null);
            return userInfo2;
            t4Var.f27866a = null;
            t4Var.f27867b = aVar;
            t4Var.f27868c = cVar;
            t4Var.f27869d = i11;
            t4Var.f27870e = 0;
            t4Var.H = 2;
            Object objO = o(t4Var);
            if (objO != obj2) {
                i12 = 0;
                cVar2 = cVar;
                i13 = i11;
                obj = objO;
                int i19 = i12;
                userInfo = (UserInfo) cVar2.invoke(obj);
                t4Var.f27866a = null;
                t4Var.f27867b = aVar;
                t4Var.f27868c = userInfo;
                t4Var.f27869d = i13;
                t4Var.f27870e = i19;
                t4Var.H = 3;
                if (r(userInfo, t4Var) != obj2) {
                    userInfo2 = userInfo;
                    aVar2 = aVar;
                    aVar2.a(null);
                    return userInfo2;
                }
            }
            return obj2;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0250 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object p(int i11, xy.c cVar) throws Throwable {
        l4 l4Var;
        String strK;
        int i12;
        Object objM;
        String str;
        int i13;
        UserInfo userInfo;
        boolean zD;
        Object obj;
        Object objA;
        if (cVar instanceof l4) {
            l4Var = (l4) cVar;
            int i14 = l4Var.f27687f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l4Var.f27687f = i14 - Integer.MIN_VALUE;
            } else {
                l4Var = new l4(this, cVar);
            }
        } else {
            l4Var = new l4(this, cVar);
        }
        Object obj2 = l4Var.f27685d;
        Object obj3 = wy.a.COROUTINE_SUSPENDED;
        int i15 = l4Var.f27687f;
        int i16 = 1;
        int i17 = 0;
        vy.d dVar = null;
        if (i15 == 0) {
            com.bumptech.glide.e.F(obj2);
            strK = xt.d.k(i11);
            l4Var.f27683b = strK;
            i12 = i11;
            l4Var.f27682a = i12;
            l4Var.f27687f = 1;
            yz.f fVar = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new e6.q0(this, dVar, 19), l4Var);
            if (objM != obj3) {
            }
            return obj3;
        }
        if (i15 == 1) {
            int i18 = l4Var.f27682a;
            strK = l4Var.f27683b;
            com.bumptech.glide.e.F(obj2);
            objM = obj2;
            i12 = i18;
        } else {
            if (i15 == 2) {
                int i19 = l4Var.f27682a;
                com.bumptech.glide.e.F(obj2);
                i13 = i19;
                str = null;
                userInfo = (UserInfo) obj2;
                l4Var.f27683b = str;
                l4Var.f27684c = userInfo;
                l4Var.f27682a = i13;
                l4Var.f27687f = 3;
                if (k(i13, l4Var) != obj3) {
                }
                return obj3;
            }
            if (i15 != 3) {
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                UserInfo userInfo2 = l4Var.f27684c;
                com.bumptech.glide.e.F(obj2);
                return userInfo2;
            }
            int i21 = l4Var.f27682a;
            userInfo = l4Var.f27684c;
            com.bumptech.glide.e.F(obj2);
            i13 = i21;
            str = null;
        }
        l4Var.f27683b = str;
        l4Var.f27684c = userInfo;
        l4Var.f27682a = i13;
        l4Var.f27687f = 4;
        zD = ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i13));
        obj = qy.b0.f48488a;
        if (zD && (objA = this.f27968a.T().a(new SubLearnProgressEntity("cn_tone", BuildConfig.VERSION_NAME, System.currentTimeMillis()), l4Var)) == wy.a.COROUTINE_SUSPENDED) {
            obj = objA;
        }
        if (obj != obj3) {
            return obj3;
        }
        return userInfo;
        UserInfo userInfo3 = (UserInfo) objM;
        String skillMastery = userInfo3.getSkillMastery();
        String str2 = SemtNwfPgIhi.RPQThbipt;
        int i22 = 6;
        List listW0 = oz.q.W0(skillMastery, new String[]{str2}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : listW0) {
            if (((String) obj4).length() > 0) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i23 = 0;
        while (i23 < size) {
            Object obj5 = arrayList.get(i23);
            i23++;
            List listW1 = oz.q.W0((String) obj5, new String[]{":"}, i17, i22);
            arrayList2.add(new vt.a1((String) listW1.get(i17), Float.parseFloat((String) listW1.get(i16)), Integer.parseInt((String) listW1.get(2)), Integer.parseInt((String) listW1.get(3))));
            userInfo3 = userInfo3;
            i16 = 1;
            i17 = 0;
            i22 = 6;
        }
        UserInfo userInfo4 = userInfo3;
        int iW = ry.x.W(ry.n.W(arrayList2, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        int size2 = arrayList2.size();
        int i24 = 0;
        while (i24 < size2) {
            Object obj6 = arrayList2.get(i24);
            i24++;
            linkedHashMap.put(((vt.a1) obj6).f54175a, obj6);
        }
        LinkedHashMap linkedHashMapK0 = ry.x.k0(linkedHashMap);
        linkedHashMapK0.put(strK, new vt.a1(strK, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0));
        String strY0 = ry.m.y0(linkedHashMapK0.values(), ";", null, null, new n2(4), 30);
        List listW2 = oz.q.W0(userInfo4.getAchievementLanguages(), new String[]{str2}, 0, 6);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj7 : listW2) {
            if (((String) obj7).length() > 0) {
                arrayList3.add(obj7);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        int i25 = 0;
        while (i25 < size3) {
            Object obj8 = arrayList3.get(i25);
            i25++;
            String str3 = (String) obj8;
            int iI0 = oz.q.I0(str3, ":", 0, false, 6);
            if (iI0 <= 0) {
                str3 = null;
            } else {
                String strSubstring = str3.substring(0, iI0);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                if (strSubstring.equals(strK)) {
                    str3 = null;
                }
            }
            if (str3 != null) {
                arrayList4.add(str3);
            }
        }
        fz.c gVar = new au.g(strY0, ry.m.y0(arrayList4, ";", null, null, null, 62), 4);
        str = null;
        l4Var.f27683b = null;
        l4Var.f27682a = i12;
        l4Var.f27687f = 2;
        Object objU = u(gVar, l4Var);
        if (objU != obj3) {
            i13 = i12;
            obj2 = objU;
            userInfo = (UserInfo) obj2;
            l4Var.f27683b = str;
            l4Var.f27684c = userInfo;
            l4Var.f27682a = i13;
            l4Var.f27687f = 3;
            if (k(i13, l4Var) != obj3) {
                l4Var.f27683b = str;
                l4Var.f27684c = userInfo;
                l4Var.f27682a = i13;
                l4Var.f27687f = 4;
                zD = ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i13));
                obj = qy.b0.f48488a;
                if (zD) {
                    obj = objA;
                }
                if (obj != obj3) {
                    return userInfo;
                }
            }
        }
        return obj3;
    }
}
