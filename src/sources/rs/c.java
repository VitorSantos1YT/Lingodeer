package rs;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SRSStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import ns.o;
import nz.i;
import nz.n;
import oz.q;
import oz.x;
import ry.l;
import ry.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f49397a = l.m0(new String[]{"H:", "M:", "H : ", "F:", "F : ", "F1:", "F&M:"});

    public static final boolean a(a aVar, SRSStatus status) {
        m.f(aVar, "<this>");
        m.f(status, "status");
        int elemType = status.getElemType();
        if (elemType == 0) {
            return aVar.f49394a.contains(Long.valueOf(status.getElemId()));
        }
        if (elemType == 1) {
            return aVar.f49395b.contains(Long.valueOf(status.getElemId()));
        }
        if (elemType != 2) {
            return false;
        }
        return aVar.f49396c.contains(Long.valueOf(status.getElemId()));
    }

    public static final boolean b(boolean z11, boolean z12, boolean z13, ArrayList arrayList, boolean z14) {
        List listK0;
        int i11;
        if (z11 && z12 && z13 && !arrayList.isEmpty()) {
            if (f49397a.contains(((g) ry.m.q0(arrayList)).f49407a)) {
                listK0 = arrayList;
                listK0 = ry.m.k0(arrayList, 1);
            }
            listK0 = arrayList;
            if (!listK0.isEmpty()) {
                if (z14) {
                    nz.g gVar = new nz.g(n.R(ry.m.g0(listK0), new ro.e(1)));
                    while (gVar.hasNext()) {
                        g gVar2 = (g) gVar.next();
                        List listW0 = q.W0(gVar2.f49408b, new String[]{" "}, 0, 6);
                        if (listW0.isEmpty()) {
                            i11 = 0;
                        } else {
                            Iterator it = listW0.iterator();
                            i11 = 0;
                            while (it.hasNext()) {
                                if (((String) it.next()).length() > 0 && (i11 = i11 + 1) < 0) {
                                    o.U();
                                    throw null;
                                }
                            }
                        }
                        if (i11 <= x.q0(q.i1(gVar2.f49407a).toString(), " ", BuildConfig.VERSION_NAME).length()) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final a c(Iterable iterable) {
        m.f(iterable, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            SRSStatus sRSStatus = (SRSStatus) it.next();
            int elemType = sRSStatus.getElemType();
            if (elemType == 0) {
                linkedHashSet.add(Long.valueOf(sRSStatus.getElemId()));
            } else if (elemType == 1) {
                linkedHashSet2.add(Long.valueOf(sRSStatus.getElemId()));
            } else if (elemType == 2) {
                linkedHashSet3.add(Long.valueOf(sRSStatus.getElemId()));
            }
        }
        return new a(linkedHashSet, linkedHashSet2, linkedHashSet3);
    }

    public static final a d(d dVar, boolean z11, boolean z12) {
        i iVarR = n.R(ry.m.g0(dVar.f49398a.values()), new ro.e(2));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        nz.g gVar = new nz.g(iVarR);
        while (gVar.hasNext()) {
            linkedHashSet.add(Long.valueOf(((CourseWord) gVar.next()).getWordId()));
        }
        Collection<CourseSentence> collectionValues = dVar.f49399b.values();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (CourseSentence courseSentence : collectionValues) {
            Long lValueOf = Long.valueOf(courseSentence.getSentenceId());
            List<CourseWord> courseWords = courseSentence.getCourseWords();
            ArrayList arrayList = new ArrayList(ry.n.W(courseWords, 10));
            for (CourseWord courseWord : courseWords) {
                arrayList.add(new g(courseWord.getWord(), courseWord.getZhuYin(), courseWord.getWordType()));
            }
            if (!b(true, true, true, arrayList, z12)) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                linkedHashSet2.add(lValueOf);
            }
        }
        return new a(linkedHashSet, linkedHashSet2, z11 ? dVar.f49400c.keySet() : t.f50856a);
    }
}
