package fr;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lingodeer.data.model.CourseQuestionPreferencePayload;
import com.lingodeer.data.model.CourseQuestionPreferencePayloadKt;
import com.lingodeer.data.model.SubCourseProgressCollectionItem;
import com.lingodeer.data.model.SubLearnProgress;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.ConvertUtilsKt;
import com.lingodeer.network.model.ServerJsonResponse;
import com.lingodeer.network.model.SubCourseProgressResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f27443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f27444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3 f27446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(i3 i3Var, vy.d dVar) {
        super(1, dVar);
        this.f27446e = i3Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new c3(this.f27446e, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((c3) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:128:0x031d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0339 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x033b  */
    /* JADX WARN: Code duplicated, block: B:132:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x033f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0342 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0344 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x037b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0383  */
    /* JADX WARN: Code duplicated, block: B:158:0x03be  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:165:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:169:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:172:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:181:0x0425  */
    /* JADX WARN: Code duplicated, block: B:184:0x044b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0451  */
    /* JADX WARN: Code duplicated, block: B:190:0x045b  */
    /* JADX WARN: Code duplicated, block: B:195:0x047a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0483  */
    /* JADX WARN: Code duplicated, block: B:206:0x0408 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x036f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0116  */
    /* JADX WARN: Code duplicated, block: B:28:0x011a  */
    /* JADX WARN: Code duplicated, block: B:30:0x011e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0136  */
    /* JADX WARN: Code duplicated, block: B:36:0x0146 A[LOOP:0: B:34:0x0140->B:36:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0162  */
    /* JADX WARN: Code duplicated, block: B:43:0x0172 A[LOOP:1: B:41:0x016c->B:43:0x0172, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x0202  */
    /* JADX WARN: Code duplicated, block: B:72:0x0223  */
    /* JADX WARN: Code duplicated, block: B:75:0x022b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0234  */
    /* JADX WARN: Code duplicated, block: B:79:0x0248  */
    /* JADX WARN: Code duplicated, block: B:81:0x0255  */
    /* JADX WARN: Code duplicated, block: B:82:0x025a  */
    /* JADX WARN: Code duplicated, block: B:84:0x025e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0263  */
    /* JADX WARN: Code duplicated, block: B:88:0x026d  */
    /* JADX WARN: Code duplicated, block: B:93:0x027f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0284  */
    /* JADX WARN: Code duplicated, block: B:97:0x028a  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x01ad, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object objM;
        dv.u0 u0Var;
        Object objV;
        List list;
        List<String> list2;
        ApiResponse apiResponse;
        int iW;
        LinkedHashMap linkedHashMap;
        int iW2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        vt.n0 n0Var;
        vt.b1 b1Var;
        wy.a aVar;
        wy.a aVar2;
        Object objM2;
        String str;
        SubLearnProgress subLearnProgress;
        SubCourseProgressCollectionItem subCourseProgressCollectionItem;
        Iterator it2;
        vt.b1 b1Var2;
        wy.a aVar3;
        LinkedHashMap linkedHashMap3;
        long time;
        long time2;
        boolean z11;
        String progress;
        LinkedHashMap linkedHashMapC;
        String progress2;
        LinkedHashMap linkedHashMapC2;
        boolean z12;
        boolean z13;
        Iterator it3;
        LinkedHashMap linkedHashMap4;
        String strValueOf;
        String str2;
        String strY0;
        boolean z14;
        long jMax;
        o3 o3Var;
        long time3;
        long time4;
        long j11;
        String str3;
        long time5;
        long time6;
        String progress3;
        String progress4;
        boolean z15;
        long jMaxUpdatedAt;
        long jMax2;
        Object objR;
        c3 c3Var = this;
        i3 i3Var = c3Var.f27446e;
        vt.n0 n0Var2 = i3Var.f27600a;
        dv.u0 u0Var2 = i3Var.f27611l;
        vt.b1 b1Var3 = i3Var.f27612n;
        wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
        int i11 = c3Var.f27445d;
        int i12 = 27;
        boolean z16 = false;
        boolean z17 = false;
        String str4 = FpIL.BXpWVbRJRXPU;
        vy.d dVar = null;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            c3Var.f27445d = 1;
            yz.f fVar = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new vt.c1((vt.d1) b1Var3, dVar, z16 ? 1 : 0), c3Var);
            if (objM != aVar4) {
            }
            return aVar4;
        }
        if (i11 == 1) {
            com.bumptech.glide.e.F(obj);
            objM = obj;
        } else {
            if (i11 == 2) {
                List<String> list3 = c3Var.f27443b;
                List list4 = c3Var.f27442a;
                com.bumptech.glide.e.F(obj);
                list = list4;
                list2 = list3;
                u0Var = u0Var2;
                objV = obj;
                apiResponse = (ApiResponse) objV;
                if (!(apiResponse instanceof ApiResponse.Error)) {
                    if (apiResponse instanceof ApiResponse.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<SubCourseProgressCollectionItem> subCourseProgressCollectionItems = ConvertUtilsKt.toSubCourseProgressCollectionItems((SubCourseProgressResponse) ((ApiResponse.Success) apiResponse).getData());
                    iW = ry.x.W(ry.n.W(subCourseProgressCollectionItems, 10));
                    if (iW < 16) {
                        iW = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iW);
                    for (Object obj2 : subCourseProgressCollectionItems) {
                        linkedHashMap.put(((SubCourseProgressCollectionItem) obj2).getId(), obj2);
                    }
                    iW2 = ry.x.W(ry.n.W(list, 10));
                    if (iW2 < 16) {
                        iW2 = 16;
                    }
                    linkedHashMap2 = new LinkedHashMap(iW2);
                    for (Object obj3 : list) {
                        linkedHashMap2.put(((SubLearnProgress) obj3).getId(), obj3);
                    }
                    Set setF1 = ry.m.f1(qx.b.D(qx.b.D(linkedHashMap.keySet(), linkedHashMap2.keySet()), list2));
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    it = setF1.iterator();
                    while (it.hasNext()) {
                        str = (String) it.next();
                        subLearnProgress = (SubLearnProgress) linkedHashMap2.get(str);
                        subCourseProgressCollectionItem = (SubCourseProgressCollectionItem) linkedHashMap.get(str);
                        if (CourseQuestionPreferencePayloadKt.isCourseQuestionPreferenceProgressId(str)) {
                            if (subLearnProgress != null) {
                                time5 = subLearnProgress.getTime();
                            } else {
                                time5 = 0;
                            }
                            linkedHashMap3 = linkedHashMap;
                            time6 = subCourseProgressCollectionItem != null ? subCourseProgressCollectionItem.getTime() : 0L;
                            if (time5 >= time6) {
                                z16 = true;
                            }
                            it2 = it;
                            CourseQuestionPreferencePayload.Companion companion = CourseQuestionPreferencePayload.Companion;
                            if (subLearnProgress != null) {
                                progress3 = subLearnProgress.getProgress();
                            } else {
                                progress3 = null;
                            }
                            CourseQuestionPreferencePayload courseQuestionPreferencePayload = companion.parse(progress3);
                            if (subCourseProgressCollectionItem != null) {
                                progress4 = subCourseProgressCollectionItem.getProgress();
                            } else {
                                progress4 = null;
                            }
                            CourseQuestionPreferencePayload courseQuestionPreferencePayload2 = companion.parse(progress4);
                            CourseQuestionPreferencePayload courseQuestionPreferencePayloadMergedWith = courseQuestionPreferencePayload.mergedWith(courseQuestionPreferencePayload2, z16);
                            String progressString = courseQuestionPreferencePayloadMergedWith.toProgressString();
                            String progressString2 = courseQuestionPreferencePayload2.toProgressString();
                            if (subCourseProgressCollectionItem == null && kotlin.jvm.internal.m.a(progressString, progressString2)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            b1Var2 = b1Var3;
                            aVar3 = aVar4;
                            jMaxUpdatedAt = courseQuestionPreferencePayloadMergedWith.maxUpdatedAt();
                            if (z15) {
                                jMax2 = Math.max(System.currentTimeMillis(), jMaxUpdatedAt);
                            } else {
                                jMax2 = Math.max(time5, Math.max(time6, jMaxUpdatedAt));
                            }
                            o3Var = new o3(progressString, jMax2, z15);
                        } else {
                            it2 = it;
                            linkedHashMap2 = linkedHashMap2;
                            n0Var2 = n0Var2;
                            b1Var2 = b1Var3;
                            aVar3 = aVar4;
                            linkedHashMap3 = linkedHashMap;
                            if (subLearnProgress != null) {
                                time = subLearnProgress.getTime();
                            } else {
                                time = 0;
                            }
                            if (subCourseProgressCollectionItem != null) {
                                time2 = subCourseProgressCollectionItem.getTime();
                            } else {
                                time2 = 0;
                            }
                            if (kotlin.jvm.internal.m.a(str, str4)) {
                                if (subLearnProgress != null && oz.q.K0(subLearnProgress.getProgress())) {
                                    time3 = subLearnProgress.getTime();
                                    if (subCourseProgressCollectionItem != null) {
                                        time4 = subCourseProgressCollectionItem.getTime();
                                    } else {
                                        time4 = 0;
                                    }
                                    if (time3 > time4) {
                                        o3Var = new o3(BuildConfig.VERSION_NAME, Math.max(System.currentTimeMillis(), time), true);
                                    }
                                    j11 = o3Var.f27759b;
                                    str3 = o3Var.f27758a;
                                    if (subLearnProgress != null || !kotlin.jvm.internal.m.a(subLearnProgress.getProgress(), str3) || subLearnProgress.getTime() != j11) {
                                        arrayList.add(new SubLearnProgress(str, str3, j11));
                                    }
                                    if (!o3Var.f27760c && (str3.length() > 0 || kotlin.jvm.internal.m.a(str, str4))) {
                                        arrayList2.add(new SubCourseProgressCollectionItem(str, str3, j11));
                                    }
                                    aVar4 = aVar3;
                                    linkedHashMap = linkedHashMap3;
                                    it = it2;
                                    linkedHashMap2 = linkedHashMap2;
                                    n0Var2 = n0Var2;
                                    b1Var3 = b1Var2;
                                }
                                z11 = true;
                                if (subCourseProgressCollectionItem == null && oz.q.K0(subCourseProgressCollectionItem.getProgress())) {
                                    if (subCourseProgressCollectionItem.getTime() > (subLearnProgress != null ? subLearnProgress.getTime() : 0L)) {
                                        o3Var = new o3(BuildConfig.VERSION_NAME, time2, false);
                                        aVar3 = aVar3;
                                        z16 = false;
                                    }
                                }
                                j11 = o3Var.f27759b;
                                str3 = o3Var.f27758a;
                                if (subLearnProgress != null) {
                                    arrayList.add(new SubLearnProgress(str, str3, j11));
                                } else {
                                    arrayList.add(new SubLearnProgress(str, str3, j11));
                                }
                                if (!o3Var.f27760c) {
                                }
                                aVar4 = aVar3;
                                linkedHashMap = linkedHashMap3;
                                it = it2;
                                linkedHashMap2 = linkedHashMap2;
                                n0Var2 = n0Var2;
                                b1Var3 = b1Var2;
                            } else {
                                z11 = true;
                            }
                            if (subLearnProgress != null) {
                                progress = subLearnProgress.getProgress();
                            } else {
                                progress = null;
                            }
                            linkedHashMapC = i3.c(progress);
                            if (subCourseProgressCollectionItem != null) {
                                progress2 = subCourseProgressCollectionItem.getProgress();
                            } else {
                                progress2 = null;
                            }
                            linkedHashMapC2 = i3.c(progress2);
                            if (time >= time2) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (linkedHashMapC.isEmpty() || !linkedHashMapC2.isEmpty()) {
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                z13 = z12;
                                it3 = qx.b.D(linkedHashMapC.keySet(), linkedHashMapC2.keySet()).iterator();
                                while (it3.hasNext()) {
                                    String str5 = (String) it3.next();
                                    LinkedHashMap linkedHashMap6 = linkedHashMapC;
                                    strValueOf = (String) linkedHashMapC.get(str5);
                                    Iterator it4 = it3;
                                    str2 = (String) linkedHashMapC2.get(str5);
                                    if (strValueOf != null && str2 != null) {
                                        strValueOf = str2;
                                        linkedHashMap5.put(str5, strValueOf);
                                    } else if (str2 != null && strValueOf != null) {
                                        linkedHashMap5.put(str5, strValueOf);
                                    } else if (strValueOf == null && str2 != null) {
                                        if (!strValueOf.equals(str2)) {
                                            Integer numT0 = oz.x.t0(strValueOf);
                                            Integer numT1 = oz.x.t0(str2);
                                            if (numT0 != null && numT1 != null) {
                                                strValueOf = String.valueOf(Math.max(numT0.intValue(), numT1.intValue()));
                                            } else if (!z13) {
                                                strValueOf = str2;
                                            }
                                        }
                                        linkedHashMap5.put(str5, strValueOf);
                                    }
                                    linkedHashMapC = linkedHashMap6;
                                    it3 = it4;
                                }
                                linkedHashMap4 = linkedHashMap5;
                            } else {
                                linkedHashMap4 = new LinkedHashMap();
                                z13 = z12;
                            }
                            if (linkedHashMap4.isEmpty()) {
                                strY0 = BuildConfig.VERSION_NAME;
                                z16 = false;
                            } else {
                                z16 = false;
                                strY0 = ry.m.y0(ry.m.S0(linkedHashMap4.entrySet(), new a2(new b4.e(23), 0 == true ? 1 : 0)), ";", null, null, new dv.e(27), 30);
                            }
                            if (subCourseProgressCollectionItem != null || (z13 && !linkedHashMap4.equals(linkedHashMapC2))) {
                                z14 = true;
                            } else {
                                z14 = z16 ? 1 : 0;
                            }
                            if (z14) {
                                jMax = System.currentTimeMillis();
                            } else {
                                jMax = Math.max(time, time2);
                            }
                            o3Var = new o3(strY0, jMax, z14);
                            j11 = o3Var.f27759b;
                            str3 = o3Var.f27758a;
                            if (subLearnProgress != null) {
                                arrayList.add(new SubLearnProgress(str, str3, j11));
                            } else {
                                arrayList.add(new SubLearnProgress(str, str3, j11));
                            }
                            if (!o3Var.f27760c) {
                            }
                            aVar4 = aVar3;
                            linkedHashMap = linkedHashMap3;
                            it = it2;
                            linkedHashMap2 = linkedHashMap2;
                            n0Var2 = n0Var2;
                            b1Var3 = b1Var2;
                        }
                        aVar3 = aVar3;
                        z16 = false;
                        j11 = o3Var.f27759b;
                        str3 = o3Var.f27758a;
                        if (subLearnProgress != null) {
                            arrayList.add(new SubLearnProgress(str, str3, j11));
                        } else {
                            arrayList.add(new SubLearnProgress(str, str3, j11));
                        }
                        if (!o3Var.f27760c) {
                        }
                        aVar4 = aVar3;
                        linkedHashMap = linkedHashMap3;
                        it = it2;
                        linkedHashMap2 = linkedHashMap2;
                        n0Var2 = n0Var2;
                        b1Var3 = b1Var2;
                    }
                    n0Var = n0Var2;
                    b1Var = b1Var3;
                    aVar = aVar4;
                    if (arrayList.isEmpty()) {
                        c3Var = this;
                        aVar2 = aVar;
                    } else {
                        c3Var = this;
                        c3Var.f27442a = null;
                        c3Var.f27443b = null;
                        c3Var.f27444c = arrayList2;
                        c3Var.f27445d = 3;
                        yz.f fVar2 = rz.o0.f50940a;
                        objM2 = rz.e0.M(yz.e.f58387a, new sr.d(16, (vt.d1) b1Var, arrayList, null), c3Var);
                        if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                            objM2 = qy.b0.f48488a;
                        }
                        aVar2 = aVar;
                        if (objM2 == aVar2) {
                            return aVar2;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        String strW = ((o0) n0Var).w();
                        c3Var.f27442a = null;
                        c3Var.f27443b = null;
                        c3Var.f27444c = null;
                        c3Var.f27445d = 4;
                        objR = u0Var.r(strW, arrayList2, c3Var);
                        if (objR == aVar2) {
                            return aVar2;
                        }
                    }
                    z17 = true;
                }
                return Boolean.valueOf(z17);
            }
            if (i11 == 3) {
                ArrayList arrayList3 = c3Var.f27444c;
                com.bumptech.glide.e.F(obj);
                arrayList2 = arrayList3;
                u0Var = u0Var2;
                n0Var = n0Var2;
                aVar2 = aVar4;
                if (!arrayList2.isEmpty()) {
                    String strW2 = ((o0) n0Var).w();
                    c3Var.f27442a = null;
                    c3Var.f27443b = null;
                    c3Var.f27444c = null;
                    c3Var.f27445d = 4;
                    objR = u0Var.r(strW2, arrayList2, c3Var);
                    if (objR == aVar2) {
                        return aVar2;
                    }
                }
                z17 = true;
                return Boolean.valueOf(z17);
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            objR = obj;
        }
        if (((ApiResponse) objR) instanceof ApiResponse.Error) {
            return Boolean.FALSE;
        }
        z17 = true;
        return Boolean.valueOf(z17);
        List list5 = (List) objM;
        List<String> listBuildAllCourseQuestionPreferenceProgressIds = CourseQuestionPreferencePayloadKt.buildAllCourseQuestionPreferenceProgressIds(ry.l.i0(xt.d.f56292a));
        ArrayList arrayList4 = new ArrayList(ry.n.W(list5, 10));
        Iterator it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((SubLearnProgress) it5.next()).getId());
        }
        List listJ0 = ry.m.j0(ry.m.H0(ry.m.G0(str4, arrayList4), listBuildAllCourseQuestionPreferenceProgressIds));
        String strW3 = ((o0) n0Var2).w();
        c3Var.f27442a = list5;
        c3Var.f27443b = listBuildAllCourseQuestionPreferenceProgressIds;
        c3Var.f27445d = 2;
        JsonObject jsonObjectC = ep.a.c("uid", strW3);
        jsonObjectC.add("sub_course_names", new Gson().toJsonTree(listJ0));
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", b7.e0.i(u0Var2, jsonObjectC, u0Var2.f24526e));
        qy.l lVar = (qy.l) lVarY.f48496b;
        u0Var = u0Var2;
        objV = u0Var.v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<SubCourseProgressResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataSubcourseProgressGet$2
        }, null, new dv.g0(u0Var2, (JsonObject) lVarY.f48495a, dVar, i12), c3Var);
        if (objV == aVar4) {
            return aVar4;
        }
        list = list5;
        list2 = listBuildAllCourseQuestionPreferenceProgressIds;
        apiResponse = (ApiResponse) objV;
        if (!(apiResponse instanceof ApiResponse.Error)) {
            if (apiResponse instanceof ApiResponse.Success) {
                throw new NoWhenBranchMatchedException();
            }
            List<SubCourseProgressCollectionItem> subCourseProgressCollectionItems2 = ConvertUtilsKt.toSubCourseProgressCollectionItems((SubCourseProgressResponse) ((ApiResponse.Success) apiResponse).getData());
            iW = ry.x.W(ry.n.W(subCourseProgressCollectionItems2, 10));
            if (iW < 16) {
                iW = 16;
            }
            linkedHashMap = new LinkedHashMap(iW);
            while (r1.hasNext()) {
                linkedHashMap.put(((SubCourseProgressCollectionItem) obj2).getId(), obj2);
            }
            iW2 = ry.x.W(ry.n.W(list, 10));
            if (iW2 < 16) {
                iW2 = 16;
            }
            linkedHashMap2 = new LinkedHashMap(iW2);
            while (r1.hasNext()) {
                linkedHashMap2.put(((SubLearnProgress) obj3).getId(), obj3);
            }
            Set setF2 = ry.m.f1(qx.b.D(qx.b.D(linkedHashMap.keySet(), linkedHashMap2.keySet()), list2));
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            it = setF2.iterator();
            while (it.hasNext()) {
                str = (String) it.next();
                subLearnProgress = (SubLearnProgress) linkedHashMap2.get(str);
                subCourseProgressCollectionItem = (SubCourseProgressCollectionItem) linkedHashMap.get(str);
                if (CourseQuestionPreferencePayloadKt.isCourseQuestionPreferenceProgressId(str)) {
                    if (subLearnProgress != null) {
                        time5 = subLearnProgress.getTime();
                    } else {
                        time5 = 0;
                    }
                    linkedHashMap3 = linkedHashMap;
                    time6 = subCourseProgressCollectionItem != null ? subCourseProgressCollectionItem.getTime() : 0L;
                    if (time5 >= time6) {
                        z16 = true;
                    }
                    it2 = it;
                    CourseQuestionPreferencePayload.Companion companion2 = CourseQuestionPreferencePayload.Companion;
                    if (subLearnProgress != null) {
                        progress3 = subLearnProgress.getProgress();
                    } else {
                        progress3 = null;
                    }
                    CourseQuestionPreferencePayload courseQuestionPreferencePayload3 = companion2.parse(progress3);
                    if (subCourseProgressCollectionItem != null) {
                        progress4 = subCourseProgressCollectionItem.getProgress();
                    } else {
                        progress4 = null;
                    }
                    CourseQuestionPreferencePayload courseQuestionPreferencePayload4 = companion2.parse(progress4);
                    CourseQuestionPreferencePayload courseQuestionPreferencePayloadMergedWith2 = courseQuestionPreferencePayload3.mergedWith(courseQuestionPreferencePayload4, z16);
                    String progressString3 = courseQuestionPreferencePayloadMergedWith2.toProgressString();
                    String progressString4 = courseQuestionPreferencePayload4.toProgressString();
                    if (subCourseProgressCollectionItem == null) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    b1Var2 = b1Var3;
                    aVar3 = aVar4;
                    jMaxUpdatedAt = courseQuestionPreferencePayloadMergedWith2.maxUpdatedAt();
                    if (z15) {
                        jMax2 = Math.max(System.currentTimeMillis(), jMaxUpdatedAt);
                    } else {
                        jMax2 = Math.max(time5, Math.max(time6, jMaxUpdatedAt));
                    }
                    o3Var = new o3(progressString3, jMax2, z15);
                } else {
                    it2 = it;
                    linkedHashMap2 = linkedHashMap2;
                    n0Var2 = n0Var2;
                    b1Var2 = b1Var3;
                    aVar3 = aVar4;
                    linkedHashMap3 = linkedHashMap;
                    if (subLearnProgress != null) {
                        time = subLearnProgress.getTime();
                    } else {
                        time = 0;
                    }
                    if (subCourseProgressCollectionItem != null) {
                        time2 = subCourseProgressCollectionItem.getTime();
                    } else {
                        time2 = 0;
                    }
                    if (kotlin.jvm.internal.m.a(str, str4)) {
                        if (subLearnProgress != null) {
                            time3 = subLearnProgress.getTime();
                            if (subCourseProgressCollectionItem != null) {
                                time4 = subCourseProgressCollectionItem.getTime();
                            } else {
                                time4 = 0;
                            }
                            if (time3 > time4) {
                                o3Var = new o3(BuildConfig.VERSION_NAME, Math.max(System.currentTimeMillis(), time), true);
                            }
                            j11 = o3Var.f27759b;
                            str3 = o3Var.f27758a;
                            if (subLearnProgress != null) {
                                arrayList.add(new SubLearnProgress(str, str3, j11));
                            } else {
                                arrayList.add(new SubLearnProgress(str, str3, j11));
                            }
                            if (!o3Var.f27760c) {
                            }
                            aVar4 = aVar3;
                            linkedHashMap = linkedHashMap3;
                            it = it2;
                            linkedHashMap2 = linkedHashMap2;
                            n0Var2 = n0Var2;
                            b1Var3 = b1Var2;
                        }
                        z11 = true;
                        if (subCourseProgressCollectionItem == null) {
                        }
                        j11 = o3Var.f27759b;
                        str3 = o3Var.f27758a;
                        if (subLearnProgress != null) {
                            arrayList.add(new SubLearnProgress(str, str3, j11));
                        } else {
                            arrayList.add(new SubLearnProgress(str, str3, j11));
                        }
                        if (!o3Var.f27760c) {
                        }
                        aVar4 = aVar3;
                        linkedHashMap = linkedHashMap3;
                        it = it2;
                        linkedHashMap2 = linkedHashMap2;
                        n0Var2 = n0Var2;
                        b1Var3 = b1Var2;
                    } else {
                        z11 = true;
                    }
                    if (subLearnProgress != null) {
                        progress = subLearnProgress.getProgress();
                    } else {
                        progress = null;
                    }
                    linkedHashMapC = i3.c(progress);
                    if (subCourseProgressCollectionItem != null) {
                        progress2 = subCourseProgressCollectionItem.getProgress();
                    } else {
                        progress2 = null;
                    }
                    linkedHashMapC2 = i3.c(progress2);
                    if (time >= time2) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    if (linkedHashMapC.isEmpty()) {
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        z13 = z12;
                        it3 = qx.b.D(linkedHashMapC.keySet(), linkedHashMapC2.keySet()).iterator();
                        while (it3.hasNext()) {
                            String str6 = (String) it3.next();
                            LinkedHashMap linkedHashMap8 = linkedHashMapC;
                            strValueOf = (String) linkedHashMapC.get(str6);
                            Iterator it6 = it3;
                            str2 = (String) linkedHashMapC2.get(str6);
                            if (strValueOf != null) {
                                if (str2 != null) {
                                    if (strValueOf == null) {
                                    }
                                } else if (strValueOf == null) {
                                }
                            } else if (str2 != null) {
                                if (strValueOf == null) {
                                }
                            } else if (strValueOf == null) {
                            }
                            linkedHashMapC = linkedHashMap8;
                            it3 = it6;
                        }
                        linkedHashMap4 = linkedHashMap7;
                    } else {
                        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                        z13 = z12;
                        it3 = qx.b.D(linkedHashMapC.keySet(), linkedHashMapC2.keySet()).iterator();
                        while (it3.hasNext()) {
                            String str7 = (String) it3.next();
                            LinkedHashMap linkedHashMap10 = linkedHashMapC;
                            strValueOf = (String) linkedHashMapC.get(str7);
                            Iterator it7 = it3;
                            str2 = (String) linkedHashMapC2.get(str7);
                            if (strValueOf != null) {
                                if (str2 != null) {
                                    if (strValueOf == null) {
                                    }
                                } else if (strValueOf == null) {
                                }
                            } else if (str2 != null) {
                                if (strValueOf == null) {
                                }
                            } else if (strValueOf == null) {
                            }
                            linkedHashMapC = linkedHashMap10;
                            it3 = it7;
                        }
                        linkedHashMap4 = linkedHashMap9;
                    }
                    if (linkedHashMap4.isEmpty()) {
                        strY0 = BuildConfig.VERSION_NAME;
                        z16 = false;
                    } else {
                        z16 = false;
                        strY0 = ry.m.y0(ry.m.S0(linkedHashMap4.entrySet(), new a2(new b4.e(23), 0 == true ? 1 : 0)), ";", null, null, new dv.e(27), 30);
                    }
                    if (subCourseProgressCollectionItem != null) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        jMax = System.currentTimeMillis();
                    } else {
                        jMax = Math.max(time, time2);
                    }
                    o3Var = new o3(strY0, jMax, z14);
                    j11 = o3Var.f27759b;
                    str3 = o3Var.f27758a;
                    if (subLearnProgress != null) {
                        arrayList.add(new SubLearnProgress(str, str3, j11));
                    } else {
                        arrayList.add(new SubLearnProgress(str, str3, j11));
                    }
                    if (!o3Var.f27760c) {
                    }
                    aVar4 = aVar3;
                    linkedHashMap = linkedHashMap3;
                    it = it2;
                    linkedHashMap2 = linkedHashMap2;
                    n0Var2 = n0Var2;
                    b1Var3 = b1Var2;
                }
                aVar3 = aVar3;
                z16 = false;
                j11 = o3Var.f27759b;
                str3 = o3Var.f27758a;
                if (subLearnProgress != null) {
                    arrayList.add(new SubLearnProgress(str, str3, j11));
                } else {
                    arrayList.add(new SubLearnProgress(str, str3, j11));
                }
                if (!o3Var.f27760c) {
                }
                aVar4 = aVar3;
                linkedHashMap = linkedHashMap3;
                it = it2;
                linkedHashMap2 = linkedHashMap2;
                n0Var2 = n0Var2;
                b1Var3 = b1Var2;
            }
            n0Var = n0Var2;
            b1Var = b1Var3;
            aVar = aVar4;
            if (arrayList.isEmpty()) {
                c3Var = this;
                c3Var.f27442a = null;
                c3Var.f27443b = null;
                c3Var.f27444c = arrayList2;
                c3Var.f27445d = 3;
                yz.f fVar3 = rz.o0.f50940a;
                objM2 = rz.e0.M(yz.e.f58387a, new sr.d(16, (vt.d1) b1Var, arrayList, null), c3Var);
                if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                    objM2 = qy.b0.f48488a;
                }
                aVar2 = aVar;
                if (objM2 == aVar2) {
                    return aVar2;
                }
            } else {
                c3Var = this;
                aVar2 = aVar;
            }
            if (!arrayList2.isEmpty()) {
                String strW4 = ((o0) n0Var).w();
                c3Var.f27442a = null;
                c3Var.f27443b = null;
                c3Var.f27444c = null;
                c3Var.f27445d = 4;
                objR = u0Var.r(strW4, arrayList2, c3Var);
                if (objR == aVar2) {
                    return aVar2;
                }
                if (((ApiResponse) objR) instanceof ApiResponse.Error) {
                    return Boolean.FALSE;
                }
            }
            z17 = true;
        }
        return Boolean.valueOf(z17);
    }
}
