package ot;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.CourseWordModel010;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseWord f45786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f45788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp.b f45789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f45790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f45791f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f45792t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(lp.b bVar, long j11, long j12, long j13, vy.d dVar) {
        super(2, dVar);
        this.f45789d = bVar;
        this.f45790e = j11;
        this.f45791f = j12;
        this.f45792t = j13;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        d2 d2Var = new d2(this.f45789d, this.f45790e, this.f45791f, this.f45792t, dVar);
        d2Var.f45788c = obj;
        return d2Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object objD;
        CourseWord courseWord;
        List list;
        CourseWordModel010 courseWordModel010;
        uz.j jVar = (uz.j) this.f45788c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f45787b;
        lp.b bVar = this.f45789d;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            gp.r rVarG = ((wt.m) bVar.f40184b).g(this.f45790e);
            this.f45788c = jVar;
            this.f45787b = 1;
            objV = uz.x0.v(rVarG, this);
            if (objV != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            com.bumptech.glide.e.F(obj);
            objV = obj;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            }
            CourseWord courseWord2 = this.f45786a;
            com.bumptech.glide.e.F(obj);
            courseWord = courseWord2;
            objD = obj;
        }
        list = (List) objD;
        if (list.size() >= 4) {
            courseWordModel010 = new CourseWordModel010(courseWord.getWordId(), courseWord.getWordId(), BuildConfig.VERSION_NAME, courseWord.getWord(), courseWord, ns.o.S(list));
            this.f45788c = null;
            this.f45786a = null;
            this.f45787b = 3;
            if (jVar.emit(courseWordModel010, this) == aVar) {
                return aVar;
            }
        }
        return b0Var;
        CourseWord courseWord3 = (CourseWord) objV;
        if (courseWord3 != null) {
            this.f45788c = jVar;
            this.f45786a = courseWord3;
            this.f45787b = 2;
            objD = lp.b.d(bVar, courseWord3, this.f45791f, this.f45792t, this);
            if (objD != aVar) {
                courseWord = courseWord3;
                list = (List) objD;
                if (list.size() >= 4) {
                    courseWordModel010 = new CourseWordModel010(courseWord.getWordId(), courseWord.getWordId(), BuildConfig.VERSION_NAME, courseWord.getWord(), courseWord, ns.o.S(list));
                    this.f45788c = null;
                    this.f45786a = null;
                    this.f45787b = 3;
                    if (jVar.emit(courseWordModel010, this) == aVar) {
                    }
                }
            }
            return aVar;
        }
        return b0Var;
    }
}
