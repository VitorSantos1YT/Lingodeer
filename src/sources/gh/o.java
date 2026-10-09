package gh;

import bq.r;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n9.u1;
import qy.q;
import ry.t;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie.o f29234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh.e f29235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f29240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f29241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f29242i;

    public o(fh.e repository, String category, String difficulty, String status, boolean z11) {
        kotlin.jvm.internal.m.f(repository, "repository");
        kotlin.jvm.internal.m.f(category, "category");
        kotlin.jvm.internal.m.f(difficulty, "difficulty");
        kotlin.jvm.internal.m.f(status, "status");
        this.f29234a = new ie.o(7);
        this.f29235b = repository;
        this.f29236c = category;
        this.f29237d = difficulty;
        this.f29238e = status;
        this.f29239f = z11;
        final int i11 = 0;
        this.f29240g = com.bumptech.glide.d.v(new fz.a(this) { // from class: gh.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f29200b;

            {
                this.f29200b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        String str = this.f29200b.f29237d;
                        if (str.length() == 0) {
                            return t.f50856a;
                        }
                        List listW0 = oz.q.W0(str, new String[]{";"}, 0, 6);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (((String) obj).length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return ry.m.f1(arrayList);
                    case 1:
                        String str2 = this.f29200b.f29236c;
                        if (str2.length() == 0) {
                            return t.f50856a;
                        }
                        List listW1 = oz.q.W0(str2, new String[]{";"}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listW1) {
                            if (((String) obj2).length() > 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        return ry.m.f1(arrayList2);
                    default:
                        String str3 = this.f29200b.f29238e;
                        if (str3.length() == 0) {
                            return t.f50856a;
                        }
                        List listW2 = oz.q.W0(str3, new String[]{";"}, 0, 6);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listW2) {
                            if (((String) obj3).length() > 0) {
                                arrayList3.add(obj3);
                            }
                        }
                        return ry.m.f1(arrayList3);
                }
            }
        });
        final int i12 = 1;
        this.f29241h = com.bumptech.glide.d.v(new fz.a(this) { // from class: gh.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f29200b;

            {
                this.f29200b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        String str = this.f29200b.f29237d;
                        if (str.length() == 0) {
                            return t.f50856a;
                        }
                        List listW0 = oz.q.W0(str, new String[]{";"}, 0, 6);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (((String) obj).length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return ry.m.f1(arrayList);
                    case 1:
                        String str2 = this.f29200b.f29236c;
                        if (str2.length() == 0) {
                            return t.f50856a;
                        }
                        List listW1 = oz.q.W0(str2, new String[]{";"}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listW1) {
                            if (((String) obj2).length() > 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        return ry.m.f1(arrayList2);
                    default:
                        String str3 = this.f29200b.f29238e;
                        if (str3.length() == 0) {
                            return t.f50856a;
                        }
                        List listW2 = oz.q.W0(str3, new String[]{";"}, 0, 6);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listW2) {
                            if (((String) obj3).length() > 0) {
                                arrayList3.add(obj3);
                            }
                        }
                        return ry.m.f1(arrayList3);
                }
            }
        });
        final int i13 = 2;
        this.f29242i = com.bumptech.glide.d.v(new fz.a(this) { // from class: gh.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f29200b;

            {
                this.f29200b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        String str = this.f29200b.f29237d;
                        if (str.length() == 0) {
                            return t.f50856a;
                        }
                        List listW0 = oz.q.W0(str, new String[]{";"}, 0, 6);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (((String) obj).length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        return ry.m.f1(arrayList);
                    case 1:
                        String str2 = this.f29200b.f29236c;
                        if (str2.length() == 0) {
                            return t.f50856a;
                        }
                        List listW1 = oz.q.W0(str2, new String[]{";"}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listW1) {
                            if (((String) obj2).length() > 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        return ry.m.f1(arrayList2);
                    default:
                        String str3 = this.f29200b.f29238e;
                        if (str3.length() == 0) {
                            return t.f50856a;
                        }
                        List listW2 = oz.q.W0(str3, new String[]{";"}, 0, 6);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listW2) {
                            if (((String) obj3).length() > 0) {
                                arrayList3.add(obj3);
                            }
                        }
                        return ry.m.f1(arrayList3);
                }
            }
        });
    }

    public static final List a(o oVar, List list, List list2) {
        String publishDate;
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayListC1 = ry.m.c1(list);
        List list3 = uh.a.f52967a;
        int i11 = 0;
        for (Long l9 : c.a.n()) {
            long jLongValue = l9.longValue();
            int[] iArr = r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            ry.m.K0(arrayListC1, new g(bq.m.l(x.n().keyLanguage, jLongValue), i11));
        }
        ArrayList arrayListC2 = ry.m.c1(oVar.b(list2));
        if (!arrayListC1.isEmpty() && !arrayListC2.isEmpty()) {
            PdLesson pdLesson = (PdLesson) ry.m.s0(arrayListC1);
            if (pdLesson == null || (publishDate = pdLesson.getPublishDate()) == null) {
                publishDate = BuildConfig.VERSION_NAME;
            }
            int size = arrayListC2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayListC2.get(i12);
                i12++;
                ((PdLesson) obj).setPublishDate(publishDate);
            }
        }
        arrayListC1.addAll(0, arrayListC2);
        list.size();
        arrayListC2.size();
        arrayListC2.size();
        arrayListC1.size();
        return arrayListC1;
    }

    public static List c(List list) {
        List list2 = uh.a.f52967a;
        if (c.a.n().length == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PdLesson pdLesson = (PdLesson) obj;
            List list3 = uh.a.f52967a;
            boolean zD = ry.l.D(c.a.n(), pdLesson.getLessonId());
            boolean z11 = false;
            for (Long l9 : c.a.n()) {
                long jLongValue = l9.longValue();
                int[] iArr = r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (kotlin.jvm.internal.m.a(pdLesson.getId(), bq.m.l(x.n().keyLanguage, jLongValue))) {
                    z11 = true;
                    break;
                }
            }
            if (!zD && !z11) {
                arrayList.add(obj);
            }
        }
        list.size();
        arrayList.size();
        return arrayList;
    }

    public static List h(List list) {
        Object obj;
        Long lessonId;
        if (list.isEmpty()) {
            return list;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Long lessonId2 = ((PdLesson) obj2).getLessonId();
            Object arrayList2 = linkedHashMap.get(lessonId2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(lessonId2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            Object next = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Long l9 = (Long) entry.getKey();
            List list2 = (List) entry.getValue();
            if (l9 != null && !linkedHashSet.contains(l9)) {
                Iterator it2 = list2.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Long version = ((PdLesson) next).getVersion();
                        long jLongValue = version != null ? version.longValue() : 0L;
                        do {
                            Object next2 = it2.next();
                            Long version2 = ((PdLesson) next2).getVersion();
                            long jLongValue2 = version2 != null ? version2.longValue() : 0L;
                            if (jLongValue < jLongValue2) {
                                next = next2;
                                jLongValue = jLongValue2;
                            }
                        } while (it2.hasNext());
                    }
                }
                PdLesson pdLesson = (PdLesson) next;
                if (pdLesson == null) {
                    pdLesson = (PdLesson) ry.m.q0(list2);
                }
                arrayList.add(pdLesson);
                linkedHashSet.add(l9);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            PdLesson pdLesson2 = (PdLesson) obj3;
            if (pdLesson2.getLessonId() == null || ((lessonId = pdLesson2.getLessonId()) != null && lessonId.longValue() == 0)) {
                arrayList3.add(obj3);
            }
        }
        int size = arrayList3.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            PdLesson pdLesson3 = (PdLesson) obj4;
            String id2 = pdLesson3.getId();
            if (id2 != null && id2.length() > 0) {
                int size2 = arrayList.size();
                int i12 = 0;
                do {
                    if (i12 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i12);
                    i12++;
                } while (!kotlin.jvm.internal.m.a(((PdLesson) obj).getId(), pdLesson3.getId()));
                if (((PdLesson) obj) == null) {
                    arrayList.add(pdLesson3);
                }
            }
        }
        if (list.size() != arrayList.size()) {
            list.size();
            arrayList.size();
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final List b(List list) {
        boolean z11;
        boolean z12;
        boolean z13;
        q qVar = this.f29240g;
        boolean zIsEmpty = ((Set) qVar.getValue()).isEmpty();
        q qVar2 = this.f29242i;
        q qVar3 = this.f29241h;
        if (zIsEmpty && ((Set) qVar3.getValue()).isEmpty() && ((Set) qVar2.getValue()).isEmpty()) {
            return list;
        }
        list.size();
        Set set = (Set) qVar.getValue();
        Set set2 = (Set) qVar3.getValue();
        Objects.toString(set);
        Objects.toString(set2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PdLesson pdLesson = (PdLesson) obj;
            if (((Set) qVar.getValue()).isEmpty()) {
                z11 = true;
            } else {
                String difficuty = pdLesson.getDifficuty();
                kotlin.jvm.internal.m.e(difficuty, "getDifficuty(...)");
                List listW0 = oz.q.W0(difficuty, new String[]{"/"}, 0, 6);
                if (!listW0.isEmpty()) {
                    Iterator it = listW0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            if (str.length() > 0 && ((Set) qVar.getValue()).contains(str)) {
                                z11 = true;
                            }
                        }
                    }
                }
                z11 = false;
            }
            if (((Set) qVar3.getValue()).isEmpty()) {
                z12 = true;
            } else {
                String category = pdLesson.getCategory();
                kotlin.jvm.internal.m.e(category, "getCategory(...)");
                List listW1 = oz.q.W0(category, new String[]{"/"}, 0, 6);
                if (!listW1.isEmpty()) {
                    Iterator it2 = listW1.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            if (str2.length() > 0 && ((Set) qVar3.getValue()).contains(str2)) {
                                z12 = true;
                            }
                        }
                    }
                }
                z12 = false;
            }
            if (((Set) qVar2.getValue()).isEmpty()) {
                z13 = true;
            } else {
                boolean zContains = nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0)).contains(pdLesson.getLessonId());
                boolean z14 = false;
                boolean z15 = false;
                for (String str3 : (Set) qVar2.getValue()) {
                    if (kotlin.jvm.internal.m.a(str3, "in_progress")) {
                        z14 = true;
                    } else if (kotlin.jvm.internal.m.a(str3, "not_study")) {
                        z15 = true;
                    }
                }
                if (!(z14 && zContains) && (!z15 || zContains)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            }
            if (z11 && z12 && z13) {
                arrayList.add(obj);
            }
        }
        arrayList.size();
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (r5 == r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
    
        if (r5 == r8) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Exception r17, int r18, int r19, n9.s1 r20, int r21, xy.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.o.d(java.lang.Exception, int, int, n9.s1, int, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r6, int r7, xy.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof gh.j
            if (r0 == 0) goto L13
            r0 = r8
            gh.j r0 = (gh.j) r0
            int r1 = r0.f29212c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29212c = r1
            goto L18
        L13:
            gh.j r0 = new gh.j
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f29210a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f29212c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r8)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.bumptech.glide.e.F(r8)
            return r8
        L36:
            com.bumptech.glide.e.F(r8)
            int[] r8 = bq.r.f4959a
            boolean r8 = bq.m.G()
            if (r8 == 0) goto L4b
            r0.f29212c = r4
            java.lang.Object r6 = r5.g(r6, r7, r0)
            if (r6 != r1) goto L4a
            goto L5d
        L4a:
            return r6
        L4b:
            r0.f29212c = r3
            yz.f r8 = rz.o0.f50940a
            yz.e r8 = yz.e.f58387a
            gh.l r2 = new gh.l
            r3 = 0
            r2.<init>(r6, r7, r5, r3)
            java.lang.Object r8 = rz.e0.M(r8, r2, r0)
            if (r8 != r1) goto L5e
        L5d:
            return r1
        L5e:
            n9.v1 r8 = (n9.v1) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.o.e(int, int, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r12 == r8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(n9.s1 r11, xy.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof gh.k
            if (r0 == 0) goto L14
            r0 = r12
            gh.k r0 = (gh.k) r0
            int r1 = r0.f29218f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f29218f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            gh.k r0 = new gh.k
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f29216d
            wy.a r8 = wy.a.COROUTINE_SUSPENDED
            int r0 = r7.f29218f
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L49
            if (r0 == r2) goto L35
            if (r0 != r1) goto L2d
            com.bumptech.glide.e.F(r12)
            goto L91
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            int r11 = r7.f29215c
            int r2 = r7.f29214b
            n9.s1 r3 = r7.f29213a
            com.bumptech.glide.e.F(r12)     // Catch: java.lang.Exception -> L42
            r9 = r3
            r3 = r11
            r11 = r9
            goto L72
        L42:
            r0 = move-exception
            r12 = r0
            r4 = r11
            r5 = r3
        L46:
            r3 = r2
            r2 = r12
            goto L7f
        L49:
            com.bumptech.glide.e.F(r12)
            java.lang.Object r12 = r11.a()
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L59
            int r12 = r12.intValue()
            goto L5a
        L59:
            r12 = r2
        L5a:
            int r3 = r11.f43691a
            int[] r0 = bq.r.f4959a
            bq.m.G()
            r7.f29213a = r11     // Catch: java.lang.Exception -> L7a
            r7.f29214b = r12     // Catch: java.lang.Exception -> L7a
            r7.f29215c = r3     // Catch: java.lang.Exception -> L7a
            r7.f29218f = r2     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = r10.e(r12, r3, r7)     // Catch: java.lang.Exception -> L7a
            if (r0 != r8) goto L70
            goto L90
        L70:
            r2 = r12
            r12 = r0
        L72:
            n9.v1 r12 = (n9.v1) r12     // Catch: java.lang.Exception -> L75
            return r12
        L75:
            r0 = move-exception
            r12 = r0
            r5 = r11
            r4 = r3
            goto L46
        L7a:
            r0 = move-exception
            r5 = r11
            r2 = r0
            r4 = r3
            r3 = r12
        L7f:
            r11 = 0
            r7.f29213a = r11
            r7.f29214b = r3
            r7.f29215c = r4
            r7.f29218f = r1
            r6 = 0
            r1 = r10
            java.lang.Object r12 = r1.d(r2, r3, r4, r5, r6, r7)
            if (r12 != r8) goto L91
        L90:
            return r8
        L91:
            n9.v1 r12 = (n9.v1) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.o.f(n9.s1, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(int i11, int i12, xy.c cVar) throws Throwable {
        m mVar;
        int i13;
        int i14;
        List listC;
        List list;
        Object objM;
        int i15;
        int i16;
        boolean z11;
        Integer num;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i17 = mVar.f29229f;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                mVar.f29229f = i17 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        m mVar2 = mVar;
        Object objA = mVar2.f29227d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i18 = mVar2.f29229f;
        Object[] objArr = 0;
        int i19 = 1;
        if (i18 == 0) {
            com.bumptech.glide.e.F(objA);
            mVar2.f29224a = i11;
            mVar2.f29225b = i12;
            mVar2.f29229f = 1;
            objA = this.f29235b.a(this.f29236c, this.f29237d, i11, i12, mVar2);
            if (objA != aVar) {
                i13 = i11;
                i14 = i12;
            }
            return aVar;
        }
        if (i18 == 1) {
            i14 = mVar2.f29225b;
            i13 = mVar2.f29224a;
            com.bumptech.glide.e.F(objA);
        } else {
            if (i18 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i16 = mVar2.f29225b;
            i15 = mVar2.f29224a;
            list = mVar2.f29226c;
            com.bumptech.glide.e.F(objA);
        }
        listC = (List) objA;
        int i21 = i15;
        i14 = i16;
        i13 = i21;
        List listB = b(listC);
        List listH = h(listB);
        if (list.size() >= i14 || listH.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        list.size();
        listC.size();
        listB.size();
        listH.size();
        list.size();
        list.size();
        listH.isEmpty();
        if (i13 > 1) {
            num = new Integer(i13 - 1);
        } else {
            num = null;
        }
        return new u1(listH, num, z11 ? new Integer(i13 + 1) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
        listC = (List) objA;
        boolean z12 = this.f29239f;
        if (!z12 && i13 == 1) {
            mVar2.f29226c = listC;
            mVar2.f29224a = i13;
            mVar2.f29225b = i14;
            mVar2.f29229f = 2;
            List list2 = uh.a.f52967a;
            if (c.a.o().length() == 0) {
                objM = listC;
            } else {
                yz.f fVar = rz.o0.f50940a;
                objM = e0.M(yz.e.f58387a, new n(this, listC, objArr == true ? 1 : 0, i19), mVar2);
            }
            if (objM != aVar) {
                int i22 = i14;
                i15 = i13;
                i16 = i22;
                list = listC;
                objA = objM;
                listC = (List) objA;
                int i23 = i15;
                i14 = i16;
                i13 = i23;
            }
            return aVar;
        }
        if (z12 || i13 <= 1) {
            list = listC;
        } else {
            list = listC;
            listC = c(listC);
        }
        List listB2 = b(listC);
        List listH2 = h(listB2);
        if (list.size() >= i14) {
            z11 = false;
        } else {
            z11 = false;
        }
        list.size();
        listC.size();
        listB2.size();
        listH2.size();
        list.size();
        list.size();
        listH2.isEmpty();
        if (i13 > 1) {
            num = new Integer(i13 - 1);
        } else {
            num = null;
        }
        return new u1(listH2, num, z11 ? new Integer(i13 + 1) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
