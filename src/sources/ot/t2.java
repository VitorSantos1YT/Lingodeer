package ot;

import com.lingodeer.data.model.CourseUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 extends xy.c {
    public Collection H;
    public ArrayList K;
    public int L;
    public int M;
    public int N;
    public int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f46001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f46002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f46003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f46004f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CourseUnit f46005t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f46001c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45999a = obj;
        this.f46000b |= Integer.MIN_VALUE;
        return this.f46001c.emit(null, this);
    }
}
