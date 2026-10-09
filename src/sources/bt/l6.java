package bt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l6 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot.u1 f5680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5681e;

    public /* synthetic */ l6(ys.d0 d0Var, l1.b1 b1Var, ot.u1 u1Var, l1.b1 b1Var2, int i11) {
        this.f5677a = i11;
        this.f5678b = d0Var;
        this.f5679c = b1Var;
        this.f5680d = u1Var;
        this.f5681e = b1Var2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5677a) {
            case 0:
                l1.b1 b1Var = this.f5679c;
                List list = (List) b1Var.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    l1.b1 b1Var2 = this.f5681e;
                    if (!zHasNext) {
                        b1Var.setValue(arrayList);
                        ys.d0 d0Var = this.f5678b;
                        if (d0Var != null) {
                            boolean z11 = ((ht.q) b1Var2.getValue()) == ht.q.CORRECT;
                            d0Var.b(z11, z11);
                        }
                    } else {
                        CourseWord courseWordCopy$default = (CourseWord) it.next();
                        if (courseWordCopy$default.getSelectedState() == OptionItemSelectedState.SELECTED) {
                            if (courseWordCopy$default.getWordId() == this.f5680d.f46012a.getWordId()) {
                                b1Var2.setValue(ht.q.CORRECT);
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                b1Var2.setValue(ht.q.WRONG);
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        }
                        arrayList.add(courseWordCopy$default);
                    }
                    break;
                }
                break;
            case 1:
                l1.b1 b1Var3 = this.f5679c;
                List list2 = (List) b1Var3.getValue();
                ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                Iterator it2 = list2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    l1.b1 b1Var4 = this.f5681e;
                    if (!zHasNext2) {
                        b1Var3.setValue(arrayList2);
                        ys.d0 d0Var2 = this.f5678b;
                        if (d0Var2 != null) {
                            boolean z12 = ((ht.q) b1Var4.getValue()) == ht.q.CORRECT;
                            d0Var2.b(z12, z12);
                        }
                    } else {
                        CourseWord courseWordCopy$default2 = (CourseWord) it2.next();
                        if (courseWordCopy$default2.getSelectedState() == OptionItemSelectedState.SELECTED) {
                            if (courseWordCopy$default2.getWordId() == this.f5680d.f46012a.getWordId()) {
                                b1Var4.setValue(ht.q.CORRECT);
                                courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                b1Var4.setValue(ht.q.WRONG);
                                courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        }
                        arrayList2.add(courseWordCopy$default2);
                    }
                    break;
                }
                break;
            case 2:
                l1.b1 b1Var5 = this.f5679c;
                List list3 = (List) b1Var5.getValue();
                ArrayList arrayList3 = new ArrayList(ry.n.W(list3, 10));
                Iterator it3 = list3.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    l1.b1 b1Var6 = this.f5681e;
                    if (!zHasNext3) {
                        b1Var5.setValue(arrayList3);
                        ys.d0 d0Var3 = this.f5678b;
                        if (d0Var3 != null) {
                            boolean z13 = ((ht.q) b1Var6.getValue()) == ht.q.CORRECT;
                            d0Var3.b(z13, z13);
                        }
                    } else {
                        CourseWord courseWordCopy$default3 = (CourseWord) it3.next();
                        if (courseWordCopy$default3.getSelectedState() == OptionItemSelectedState.SELECTED) {
                            if (courseWordCopy$default3.getWordId() == this.f5680d.f46012a.getWordId()) {
                                b1Var6.setValue(ht.q.CORRECT);
                                courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                b1Var6.setValue(ht.q.WRONG);
                                courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        }
                        arrayList3.add(courseWordCopy$default3);
                    }
                    break;
                }
                break;
            case 3:
                l1.b1 b1Var7 = this.f5679c;
                List list4 = (List) b1Var7.getValue();
                ArrayList arrayList4 = new ArrayList(ry.n.W(list4, 10));
                Iterator it4 = list4.iterator();
                while (true) {
                    boolean zHasNext4 = it4.hasNext();
                    l1.b1 b1Var8 = this.f5681e;
                    if (!zHasNext4) {
                        b1Var7.setValue(arrayList4);
                        ys.d0 d0Var4 = this.f5678b;
                        if (d0Var4 != null) {
                            boolean z14 = ((ht.q) b1Var8.getValue()) == ht.q.CORRECT;
                            d0Var4.b(z14, z14);
                        }
                    } else {
                        CourseWord courseWordCopy$default4 = (CourseWord) it4.next();
                        if (courseWordCopy$default4.getSelectedState() == OptionItemSelectedState.SELECTED) {
                            if (courseWordCopy$default4.getWordId() == this.f5680d.f46012a.getWordId()) {
                                b1Var8.setValue(ht.q.CORRECT);
                                courseWordCopy$default4 = CourseWord.copy$default(courseWordCopy$default4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                b1Var8.setValue(ht.q.WRONG);
                                courseWordCopy$default4 = CourseWord.copy$default(courseWordCopy$default4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        }
                        arrayList4.add(courseWordCopy$default4);
                    }
                    break;
                }
                break;
            default:
                l1.b1 b1Var9 = this.f5679c;
                List list5 = (List) b1Var9.getValue();
                ArrayList arrayList5 = new ArrayList(ry.n.W(list5, 10));
                Iterator it5 = list5.iterator();
                while (true) {
                    boolean zHasNext5 = it5.hasNext();
                    l1.b1 b1Var10 = this.f5681e;
                    if (!zHasNext5) {
                        b1Var9.setValue(arrayList5);
                        ys.d0 d0Var5 = this.f5678b;
                        if (d0Var5 != null) {
                            boolean z15 = ((ht.q) b1Var10.getValue()) == ht.q.CORRECT;
                            d0Var5.b(z15, z15);
                        }
                    } else {
                        CourseWord courseWordCopy$default5 = (CourseWord) it5.next();
                        if (courseWordCopy$default5.getSelectedState() == OptionItemSelectedState.SELECTED) {
                            if (courseWordCopy$default5.getWordId() == this.f5680d.f46012a.getWordId()) {
                                b1Var10.setValue(ht.q.CORRECT);
                                courseWordCopy$default5 = CourseWord.copy$default(courseWordCopy$default5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                b1Var10.setValue(ht.q.WRONG);
                                courseWordCopy$default5 = CourseWord.copy$default(courseWordCopy$default5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        }
                        arrayList5.add(courseWordCopy$default5);
                    }
                    break;
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
