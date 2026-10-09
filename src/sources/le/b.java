package le;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f39920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f39921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f39922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f39923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f39924f;

    public b(Object obj, e eVar) {
        d dVar = d.CLEARED;
        this.f39923e = dVar;
        this.f39924f = dVar;
        this.f39919a = obj;
        this.f39920b = eVar;
    }

    @Override // le.e, le.c
    public final boolean a() {
        boolean z11;
        synchronized (this.f39919a) {
            try {
                z11 = this.f39921c.a() || this.f39922d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.c
    public final boolean b() {
        boolean z11;
        synchronized (this.f39919a) {
            try {
                d dVar = this.f39923e;
                d dVar2 = d.SUCCESS;
                z11 = dVar == dVar2 || this.f39924f == dVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.e
    public final boolean c(c cVar) {
        boolean z11;
        synchronized (this.f39919a) {
            e eVar = this.f39920b;
            z11 = (eVar == null || eVar.c(this)) && cVar.equals(this.f39921c);
        }
        return z11;
    }

    @Override // le.c
    public final void clear() {
        synchronized (this.f39919a) {
            try {
                d dVar = d.CLEARED;
                this.f39923e = dVar;
                this.f39921c.clear();
                if (this.f39924f != dVar) {
                    this.f39924f = dVar;
                    this.f39922d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.e
    public final boolean d(c cVar) {
        boolean z11;
        boolean zEquals;
        d dVar;
        synchronized (this.f39919a) {
            e eVar = this.f39920b;
            z11 = false;
            if (eVar == null || eVar.d(this)) {
                d dVar2 = this.f39923e;
                d dVar3 = d.FAILED;
                if (dVar2 != dVar3) {
                    zEquals = cVar.equals(this.f39921c);
                } else {
                    zEquals = cVar.equals(this.f39922d) && ((dVar = this.f39924f) == d.SUCCESS || dVar == dVar3);
                }
                if (zEquals) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    @Override // le.c
    public final void e() {
        synchronized (this.f39919a) {
            try {
                d dVar = this.f39923e;
                d dVar2 = d.RUNNING;
                if (dVar == dVar2) {
                    this.f39923e = d.PAUSED;
                    this.f39921c.e();
                }
                if (this.f39924f == dVar2) {
                    this.f39924f = d.PAUSED;
                    this.f39922d.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.e
    public final boolean f(c cVar) {
        boolean z11;
        synchronized (this.f39919a) {
            e eVar = this.f39920b;
            z11 = eVar == null || eVar.f(this);
        }
        return z11;
    }

    @Override // le.e
    public final void g(c cVar) {
        synchronized (this.f39919a) {
            try {
                if (cVar.equals(this.f39922d)) {
                    this.f39924f = d.FAILED;
                    e eVar = this.f39920b;
                    if (eVar != null) {
                        eVar.g(this);
                    }
                    return;
                }
                this.f39923e = d.FAILED;
                d dVar = this.f39924f;
                d dVar2 = d.RUNNING;
                if (dVar != dVar2) {
                    this.f39924f = dVar2;
                    this.f39922d.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.e
    public final e getRoot() {
        e root;
        synchronized (this.f39919a) {
            try {
                e eVar = this.f39920b;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // le.c
    public final boolean h() {
        boolean z11;
        synchronized (this.f39919a) {
            try {
                d dVar = this.f39923e;
                d dVar2 = d.CLEARED;
                z11 = dVar == dVar2 && this.f39924f == dVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.e
    public final void i(c cVar) {
        synchronized (this.f39919a) {
            try {
                if (cVar.equals(this.f39921c)) {
                    this.f39923e = d.SUCCESS;
                } else if (cVar.equals(this.f39922d)) {
                    this.f39924f = d.SUCCESS;
                }
                e eVar = this.f39920b;
                if (eVar != null) {
                    eVar.i(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.c
    public final boolean isRunning() {
        boolean z11;
        synchronized (this.f39919a) {
            try {
                d dVar = this.f39923e;
                d dVar2 = d.RUNNING;
                z11 = dVar == dVar2 || this.f39924f == dVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.c
    public final void j() {
        synchronized (this.f39919a) {
            try {
                d dVar = this.f39923e;
                d dVar2 = d.RUNNING;
                if (dVar != dVar2) {
                    this.f39923e = dVar2;
                    this.f39921c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.c
    public final boolean k(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f39921c.k(bVar.f39921c) && this.f39922d.k(bVar.f39922d)) {
                return true;
            }
        }
        return false;
    }
}
