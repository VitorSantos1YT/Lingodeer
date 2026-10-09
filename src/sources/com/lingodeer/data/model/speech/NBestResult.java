package com.lingodeer.data.model.speech;

import c00.a;
import c00.e;
import com.bumptech.glide.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class NBestResult {
    private final double Confidence;
    private final String Display;
    private final String ITN;
    private final String Lexical;
    private final String MaskedITN;
    private final PronunciationAssessment PronunciationAssessment;
    private final List<Word> Words;
    public static final Companion Companion = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, null, null, d.u(j.PUBLICATION, new m9(27))};

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return NBestResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ NBestResult(int i11, double d5, String str, String str2, String str3, String str4, PronunciationAssessment pronunciationAssessment, List list, o1 o1Var) {
        if (127 != (i11 & 127)) {
            d1.k(i11, 127, NBestResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.Confidence = d5;
        this.Lexical = str;
        this.ITN = str2;
        this.MaskedITN = str3;
        this.Display = str4;
        this.PronunciationAssessment = pronunciationAssessment;
        this.Words = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return new g00.d(Word$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NBestResult copy$default(NBestResult nBestResult, double d5, String str, String str2, String str3, String str4, PronunciationAssessment pronunciationAssessment, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d5 = nBestResult.Confidence;
        }
        double d11 = d5;
        if ((i11 & 2) != 0) {
            str = nBestResult.Lexical;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = nBestResult.ITN;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = nBestResult.MaskedITN;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = nBestResult.Display;
        }
        return nBestResult.copy(d11, str5, str6, str7, str4, (i11 & 32) != 0 ? nBestResult.PronunciationAssessment : pronunciationAssessment, (i11 & 64) != 0 ? nBestResult.Words : list);
    }

    public static final /* synthetic */ void write$Self$data_release(NBestResult nBestResult, b bVar, g gVar) {
        h[] hVarArr = $childSerializers;
        bVar.q(gVar, 0, nBestResult.Confidence);
        bVar.w(gVar, 1, nBestResult.Lexical);
        bVar.w(gVar, 2, nBestResult.ITN);
        bVar.w(gVar, 3, nBestResult.MaskedITN);
        bVar.w(gVar, 4, nBestResult.Display);
        bVar.A(gVar, 5, PronunciationAssessment$$serializer.INSTANCE, nBestResult.PronunciationAssessment);
        bVar.A(gVar, 6, (a) hVarArr[6].getValue(), nBestResult.Words);
    }

    public final double component1() {
        return this.Confidence;
    }

    public final String component2() {
        return this.Lexical;
    }

    public final String component3() {
        return this.ITN;
    }

    public final String component4() {
        return this.MaskedITN;
    }

    public final String component5() {
        return this.Display;
    }

    public final PronunciationAssessment component6() {
        return this.PronunciationAssessment;
    }

    public final List<Word> component7() {
        return this.Words;
    }

    public final NBestResult copy(double d5, String Lexical, String ITN, String MaskedITN, String Display, PronunciationAssessment PronunciationAssessment, List<Word> Words) {
        m.f(Lexical, "Lexical");
        m.f(ITN, "ITN");
        m.f(MaskedITN, "MaskedITN");
        m.f(Display, "Display");
        m.f(PronunciationAssessment, "PronunciationAssessment");
        m.f(Words, "Words");
        return new NBestResult(d5, Lexical, ITN, MaskedITN, Display, PronunciationAssessment, Words);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NBestResult)) {
            return false;
        }
        NBestResult nBestResult = (NBestResult) obj;
        return Double.compare(this.Confidence, nBestResult.Confidence) == 0 && m.a(this.Lexical, nBestResult.Lexical) && m.a(this.ITN, nBestResult.ITN) && m.a(this.MaskedITN, nBestResult.MaskedITN) && m.a(this.Display, nBestResult.Display) && m.a(this.PronunciationAssessment, nBestResult.PronunciationAssessment) && m.a(this.Words, nBestResult.Words);
    }

    public final double getConfidence() {
        return this.Confidence;
    }

    public final String getDisplay() {
        return this.Display;
    }

    public final String getITN() {
        return this.ITN;
    }

    public final String getLexical() {
        return this.Lexical;
    }

    public final String getMaskedITN() {
        return this.MaskedITN;
    }

    public final PronunciationAssessment getPronunciationAssessment() {
        return this.PronunciationAssessment;
    }

    public final List<Word> getWords() {
        return this.Words;
    }

    public int hashCode() {
        return this.Words.hashCode() + ((this.PronunciationAssessment.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(Double.hashCode(this.Confidence) * 31, 31, this.Lexical), 31, this.ITN), 31, this.MaskedITN), 31, this.Display)) * 31);
    }

    public String toString() {
        double d5 = this.Confidence;
        String str = this.Lexical;
        String str2 = this.ITN;
        String str3 = this.MaskedITN;
        String str4 = this.Display;
        PronunciationAssessment pronunciationAssessment = this.PronunciationAssessment;
        List<Word> list = this.Words;
        StringBuilder sb2 = new StringBuilder("NBestResult(Confidence=");
        sb2.append(d5);
        sb2.append(", Lexical=");
        sb2.append(str);
        com.google.android.material.datepicker.d.w(sb2, ", ITN=", str2, ", MaskedITN=", str3);
        sb2.append(", Display=");
        sb2.append(str4);
        sb2.append(", PronunciationAssessment=");
        sb2.append(pronunciationAssessment);
        sb2.append(", Words=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    public NBestResult(double d5, String Lexical, String ITN, String MaskedITN, String Display, PronunciationAssessment PronunciationAssessment, List<Word> Words) {
        m.f(Lexical, "Lexical");
        m.f(ITN, "ITN");
        m.f(MaskedITN, "MaskedITN");
        m.f(Display, "Display");
        m.f(PronunciationAssessment, "PronunciationAssessment");
        m.f(Words, "Words");
        this.Confidence = d5;
        this.Lexical = Lexical;
        this.ITN = ITN;
        this.MaskedITN = MaskedITN;
        this.Display = Display;
        this.PronunciationAssessment = PronunciationAssessment;
        this.Words = Words;
    }
}
