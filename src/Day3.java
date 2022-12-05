import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Day3 {

    public static String priority = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String[] input = new String[]{"LLBPGtltrGPBMMsLcLMMVMpVRhhfCDTwRwRdTfwDllRRRDhC", "gNFJHJFgtZFJjZJHNNFWZWZwwDjCwSDhfCDbdwjfwDTTDT", "gmQNZnZNHWnqmQpLtVLMBsPpBqrL", "HlHldQtHlctzppdQtjdczHhJRnnhGNVmVRJmVjCVFCNh", "LgWNgggZJZGFhCZr", "DbqPswwMvDPqzlBNHtzfHdwd", "tJgtJwwCtNvPHHPtHzDsdRTsBRDDWgWTgT", "QhLQjLGjZQFlFZmnmGLDrzWfRldrTrzTBRWTzs", "bFFmFZjhSFHvBCvCvJpb", "MSGcvnvMGMJgWJDpdndZwBnppfCp", "VPVfQQVbshZNZwdNDwNs", "LtLbjmQRLmVhQtTbfgWjJgFFcrqqrGSqWg", "fHfCNCwwHfGhcntntrrgHrQnrn", "FVqpSpbPpjSVMjqvVmVvMzlzwJnbtnnlzQQlrWzJgt", "PTqqRRPSRSmqSpPpSpRZwGCLGscCNLZZZTNdNZ", "pQQQslVSVzzCQnZSlplzbLcHZHcrrrbZqFbZjbFm", "gWtvPgdMDDtFDHHjJJbbccbrLW", "MhNvwwDfDfdtvRQnpFNNTlSRSn", "ZTnSnTTzqvFmVzvWWm", "ClpCgltHNrtgsHdpLCHtDCNLVvQvVwVmwcsWQGMMQvcGcFcv", "JmrgCHCNJtlmHmNhnJjnnnjJhPfhSJ", "BgRRZTgHHvRTRmRNLNNhQWlmGFfJlWlhsQshpF", "qPqSSttwnnzqqqwtVrPwMthFsJllJJlGhpJhWJQlhVQd", "MjMwScnDPzcwjtqDtztnctrvgNZTTvCvLgvQbLbvjTBvBg", "SWQSbbqTTbPcfMZSwZZwwn", "dghjghmNDmGsGgdnfmtMRCLCCRncfc", "pJDJNdsNMMhpssgdprBTBzWlpBWlllWb", "TwNLNZTwWCWLwWCSTZSLzWHGrDHHPmGdDHvndGdNfvMm", "BgpjtpgjBjVbRjQRhVsDnvgGgPnGdrmvnMDfrf", "rhRjRssQJplRtVbpthblbbLSLzFCJZFqLLFWCzqcqzLL", "PBrdPMtBPvCQBVBjCfWPqSHbszhGGnsfSG", "JpmDwJgWJgNzmShhmfSGzh", "pRwNcNpFZNZRWgcNplpjVCMVjdvdMQtCMLZjMZ", "lDrcnnlLqLRcDDZRLjFVTHzGCLGVPzGPVWGB", "pNwHpdmsNJsbpwsbzJTCPWTVFzzQTWCQ", "vbhswdtdwfdsmtNSssHwvllvMcZjnjcnZqlgMDZglM", "GVVtJGtzVFsVsDTH", "mQRgcBRmRLnBjrtFjCCrHmFF", "gqpBnlRpgZcvdSdlMdSvMt", "tMSCNGSflffNhnnGqlPPsrzWPrTrVpWr", "bZHbmDBQmbDZQdbDcRFZZBTTWWWwqVzszWjrFPVwrzqq", "HQBLHmQVQLDdCggMfgMNLvNG", "HHNDzNJPJPmdPcNGGGhnhwnVhCQBwBjQ", "bsSbLfrLtRSLRSRRRsBwhCpfpCzlwCBVjlCV", "zvvsvqLtZqLtzRsqTrggRMHJNWJgHHHNJcgWNPdHcH", "qgbNvqbgmmZgZLvZqgnZzlpzpzHtVPzttGPrrnnl", "jwswGjQDMsQMjdBwdcjCHVtcPVpCVCrPlVSrpc", "GsFWBfhGBfDFDFWqNbLNqbgvqbbvfN", "HgwWqtcqHNWgnHcNNCfvJCCJJfJGvnPfrR", "sbDhZSmdBbsSdmSDdrjjffRvdjPrprCd", "vvZbSFFlFHtqFqqWNc", "ZRjnbRsHlncZGjTRTfFVSQBQppQvvFBHpF", "zrLwMdhDhqJJttDQSldQVPQSlSfPlV", "hCWWCzqWnmcZlRRW", "HfgfQflHjWgRQRdRBWVsnbvvscbbbwvmbHncSc", "tJGLtPPGZPwVvSSPhw", "CLGTLZqJtMGqLDFFDZZJFZJpWjRpVNRWpllDpjlBfgVjlp", "rhhGZZhLNhPmfJqvfLlq", "dHRTHRHQQWcTCRTHmmjJgfqqlGmgWgql", "CCwRzTRRdCCRSQwzRcppprZtrMhGBMZMnDSt", "WfffvnSnfSBshwsjhlvGlh", "ZHpFNTmppVmNzVVmmFMZzbwwjHGrGlPhCGrljbgHsg", "pLZMmqVsZVMMVVscDfdtSSStqcRRdn", "RhRbLzRLHLCPmzznHLbzCRTJhdTVSJJVSjdFFNFFNTJv", "MGgMfpMsBgpnMtGfnfwBtDBjFVdNSSSFdvJSQSpTJdJjNv", "lMsBgDMsblmRblnz", "ClNcJZttLfLvvRQzQWwRQN", "hrpMdqMspsrGDdMphhdMMMMHBmRWmSVrRVzVTzQBQvSmzVWV", "ppHDMGhMMDbGMdDMGbgFbgbMlJJnjjZtZfLPcfcngZfPPfCR", "ZRslLRgCclZLZzQghQhfrbfGbJ", "pVSHpBBBBDVDqDBldVzfrMzQbfSTSJrzzJrJ", "DqqHnBDlpNDVVnpnjtDtNjCvFLcsFFPZRcPsNNmPcFcP", "LmLWSmSRNdcpcRHFHrWzWHbMbwZlZlPSbTjlwPbTPJTf", "DttBsvhnhqvGGBhGtBVNBVqJlPwslMMPJwTjZbbZPTfbPs", "CDthQvVNVFCHHWCFdr", "RRtCWSzQZdRMrtRWrSztMggcGDfQTcfFTGqTLgGDLc", "bnVhnvPHhhdJJBTLDGcDTcBvvD", "pmbnhmPPmHwdCjmdrRtCdj", "lTPzwhzmHpTvrDCDHJnsNN", "tdgtbMMBbWdFbtqJCnsrqnMMDsrq", "FjWdtgLSWttWtLSWtDWBjGGmwGlzTRwPTQGhlQQm", "wcbnTtTppNLrntznTBBccCGrVldRrZqdqRCZdFZCVZ", "JfHDgjgPPfRRgRlLRddR", "jhDhhLMfmJjMjDbNSTzbbbtmttmN", "CfGlvzpvpTjzzCWjvDlfvbbJbCRSdSRhsSQCMhdbhR", "wqrSmrLHHNcLqrrLBNsndssnnhPshnsQwbnJ", "NtcmBLcNVDWzjSvWtv", "vZPCSCvCJffvVvmCmPqCSlDSscczHDRcwcHzRlRHHs", "LFGFNnGrdQttNMFpzpMRRDslsJwsJH", "gjtLnFBJrLvhZvCbZhqB", "DBcjVFjDhQMSJVZbHZbl", "nfmsqppnLfTnfmMmzppwgllSrbSHHtllqbtSwZ", "TRzTnfRWnfdzWssfnRfRpncQPBhdDjjDCPcMQcCBGPPj", "NSjWCHjNHjpPWPpSFWdtqBMBBFVBvqvJGJwqBt", "gQllgDrnhQQDGRshRsZfVtVMRqwMtccVJcBtvRqw", "DQrzrDzhQgrsZLrZjWSSHNTWCjjNGTLH", "CgdcCFcbTbBzPgmNRmpptP", "rsZtsvVvHZZzPmqVNPzNmV", "HZjrwrjnjtHSHwDGdFhCdhWWJnWchCFJ", "RMTqQMRJqPtBtGBPtWjN", "ssHfSfShCwwbhsbHhhsmSfhSGNpCpNCjBBBLptcGtpzBBBWW", "HnwrSFwffHsFwrSSjfHglJJlTgZdFdgZRZTDDM", "pDLDWlDSlJDmzSJnDScRPLGGvqFqLPccGLgv", "CZHfwNMVNjsHNNqPgcbcBbRQGQ", "dCffZCjVCdCHHTmnlSgTlTSrlStp", "bFtlLCvLlVjpCGPJndrrMMCDDCnrMg", "hRsTwcZcBjZRJrfMDnsHrJnH", "mNZqcTSSBTScNzVQFtGtjpFtjmGG", "bjHdLrHjRWpDCtLzhzps", "lZcGfTvQcQfvlqqcNCcBvVwtGzmzthmwmpthMDmswgMt", "NcqflNQTBTTvvQSvqSVvQJbHPHbHCRJdndJPSHjWHb", "CVmRncrRVrhcmsBgfmtfdJsJmt", "bZHvZZDJwpWtdZgtGNGd", "vSbwHDMFMJqPQqQvvSPQqpSwjRcTVTLjLRhVCLFLjLFnFzCC", "mtffsmBwfwBDBmmsLsHqtpftGrMVMPSMPsVvhNvFrGPMvjNV", "TQTQCRWjJcdcQQSPrhhPSvVGPF", "cTRJCnldWJZlTgbWgbdbpqfqmppjmtljpqzmjpLw", "NNPmrmPWmrSSNNPmnglghmCvLCCflh", "LFbsDQMQFtQFHbQHqhvnngCftpcllptJgJ", "bDjsGqLLdRVjPZPP", "tgrbBQlbtRblwtRGrbCNswDDCsvFszpssCss", "SJVMhSZfHvpdhphN", "SMLpWZSSZMjfgGBgRtbQgljQ", "HsHHNDDHzHDDjsVBBZqtWBrSNcPwQvccvvdhPclSrQSc", "fGCFCgpgTfnTmgTFLFgccclhwQhwrzSwSwrCrr", "pmLJGfMRpFmfFMzmgGmRpgmVqWJDqZqqHtjBBVDBBqqssJ", "mBTfcfCCmpBCCSzNQScQSTfddhdtwgttjghNwGtGdgwGtd", "HvvqbvMLnFZVVPjJGRGzGRjZtwgw", "VFHFbsFHHSmzQBmsmT", "ZNmZCmNHHzzmPPzlbplvhbQh", "GDSwldfdvggPfLvQ", "ddqrtlnJDJlnjScRmMRCFHTHtFZF", "FPvglHSPcpNcFNSHFHNvZjdmbwdbzZtzsHDzbsbj", "MMnBLCCWBJCnrCVWCBstTZdZmdTtbDLswTtZ", "BMDnRCrnGhPPSgcgpG", "nsbgpbdrjMdGqnNRRWWRww", "tZZhPzCJhsJBtJPllJBCtCvwwcwwWLvWvwWRThcGcqLq", "mlBmZQPZmlppbgMmfssg", "RFdZTHFCdvjhgGnFqj", "zQLtNQpzNNtNpDtDPWLNMmGfBcjgjlgjhBnvcfnBvfjp", "PtmLsPzQVWzWDswCSwHbRZsGZw", "nPsfnPsFhTGjqGnmQppG", "RZhBbNwbBRZHZSCCHQqSpCpqqm", "VMbgNWRWMDfhtFJT", "RWhRPDhBHZWgZghRZwZgGJPGdncFdLcdLCjscFcjCjNLLj", "mQfSrlfTVqmSVTTTrprfFLqcdLHsLHFnvsFFqnNd", "TtQmVHmMrbMWRggRPJZP", "TTlCTVTdcpBlcchF", "ZLhwSMZhqhtqwqLjFcBvFmvvssGBmmjj", "LwSMRtqMHnqhhRZRRtJSVTgggVPdTdrVbQDJgTPW", "CGFFWFFVgjfzgVfcJCcgTCcBBWqSqMMBMBShhwMLMwSSMq", "fmQnflldltBZqlwqNZpB", "dvtnvmtRtsPbzCfTHjHcPzGf", "hzshzfshVhthgMmRsFRvFqmm", "PDDcZWlWBbplvmRRGtlvqQ", "ncjnDjbScnBWZjDVfwjfrrVtwLjzhr", "QRWvffVVGfDhNNjzGZLLcGGZ", "rgtpSSHpPrHSspvNLFlzTgNLlFglcc", "SSpbMHpvmwMQhMBR", "dHLtBqPCtPBHNsbRNdNNsZVN", "nQwntMwJWhwWjvcjDMlntRsNpgSbNNpglFpVggbSVF", "QDhJWwhzJtTqLzCmtT", "PSLqTqrCrRvCSJWLdLwdVWdQWL", "zNjHQnnHjHznnbDMnMMMdVZcpZZJpZWcdJFZ", "BntfgNbzfBtHzgnbbbPPSstlQSSGGrlGsrTT", "QpBNsBzztgqVtdmp", "jvrhGljRhSTlGGvjwjSwGjRvHVdqLttrMgMbtMMMVmdqqHfV", "ChTvTvljmCsQQQnNsQ", "CQCNSQHHgCtNHCNHHNDJcBJwLPtJBGhMPPPJwM", "zRTqmsdRRzrmdzVRpzPwcjdwwhLjMBMGBBLw", "hprmzRmblTzTVTVrlbrmVHNWNnCZFWNNFZlnDFSWgQ", "hGGqwwdwMqsRDGRBzlvDzB", "LTNTfcCFFFCcNHFFBzRSZRBlzHPSZdvD", "nLVTFNfVVLLWnwnwdrdbhnrhrr", "hlTpcDTpHmHwDmMbbdMMMGTPdGPR", "ZzFqNSQqHvBvzzqjFHtvSGRRMPQsJGJWRGWPMRdRsM", "BZjLNqNqzVVHgLVgll", "ZHHBzSZPVqghJgSnBhqJRQLRRMvQpwZvfNQRMMMp", "ctFCDmdDWmDGNRFMpRlwwQPP", "PrsmDmCGjtcmdjGtVqBSjJhnSbHnnghH", "QmZHTjmmHRmmdPRvHdVlPdrNNLqWzffbRtqpzfWtWsWNNW", "gwMcgnMGFGCjJLqfbtNtzzssCW", "DwMFGBwcBFjhBBhcDSJQQVQTPldTvPlVVZQSdQ", "NRTGfNffLghStLRR", "QlnWsdJWmnbWnVqWbWqHPSpmjgCjtSwhPjgtptLS", "JWchnllHqQJzGTZfTcFNDN", "VtdtcTVVCRctVdJclCVtpphpPhNGDwNPmThwWmgG", "ZjZMFnfBqqMjHZHMzBnzgPGwDmhmhDPfQNGPQGfD", "BbgsnFgMgMlVdJtlcVSs", "tlBMdBnClhLJnTbgph", "PhDDczqDGPqsHGrRGPWHGPzcFJNLTTJZLNbNLfFZgTbffL", "sHsmzzrGmPrRDRHqhHwmjBVtllwtdMdBSBtl", "QscfZsGsVjVtqGmlzvRMvl", "ThJNCHPTDDhHHJTJPHmlSMTtTTlBvlnMSzqn", "HhCdrHrCcpmmdVmb", "WPPBPvRWzvhWhWzGWtBqBSTLDZhgFSTCDgSgZZDCZs", "flbJmMJnjdMqNdfZZrFZZNFZgrrsTZ", "nQnqJlJdlQMMbVnVmdMplVnnBwcBPGttzQcvtHcWwWtHRHvB", "LLsmpJTWCJmJppCmgHCCLjbFtRFghzjfjcjcZttbRg", "SZlMPBdBtQfFSbSF", "nPqldlDwlBVnvdLWJVsmVNZCCVmJ", "HWvNVtHWJjHJsSgHsHzsDsmf", "RwZGPFGMQgzpTGSD", "PZMlwwqhFPPZqwFhPwnFbMjWJNNBtWNVJlCJJWJjWWzj", "frBSzJDtztfNVGwRzVgGhqsV", "MPMmjPWGMMmPCQCcbmRwVhTgVwTTqjvRTLww", "cFpcMGFplDHfBHFS", "gtjhjLffmgjgmbgVfbNdqFJMJMNbbwrwqq", "sWHHPSJsHzTZzTGsCdrqCNNddGdGFGRC", "ZpzHHTZWzsSSnBBPsTBnLVcpQfcJcQVQDQfcDfQt", "qMPqChqjQPRCMqlBrmGmLbPSsTbSvz", "nWNHZFVZZttWpfHsGSbBGTbWBSGmSm", "nZfpVfdZdtFHnwVHZtNwZhCJRJhcCdDcQhCqDSSCQc", "LlwSlZrftFSMpfLCdltTmmmSDmJqmssDVJBmJB", "cRcGGhpvDTmTDgsG", "nNPcjpWbNzjRRcWhbzWjvnLMddMLCwtdtMttddtrCdMz", "NszSsDCMSDzdZpCMCSMpNszfTvJhlvmlmrTfrhlhHPrmhD", "FRWBgRjWwqFWQFBBWjVncjRTvJfvvJvVrHhmVrHhmrdJTh", "wnwnqwRGFqdbNNtCGpCp", "zgsBvPVVDDrDtDgt", "nTHldmJQNTTfflcJNrQlHWpmDDFDFhWpWCLtFbphCm", "nTTNMlNfHQZTQPGSzVVZSVPSwr", "bPLbtPpwsJhlpnhnnLNNZDWhRNzWQrWWffNr", "SczqFdFHSTFjmMSMFVqFGCWWNRrWQQQRZCVWgQQgrZ", "dFdzFGHvjmqGMFwwLLsPnvBspnsn", "lwJwwmblVdvjbbbJvVnlmjGTTNTLqffpqDJffqGLqDLD", "ZtWgPtRMtQRQnTGDQNTTqL", "gCztMgWgchHhvwlllbnl", "cCwSSCVbqwCCWSbZMmGdtBllWBfdlvdt", "jzRsJjhPjnLthJNNpmpvmvvMfGvjQpGv", "nPHPFgRHLtCHZrqTcq", "dVJwCJGCVrQQGTNtLtGm", "hWWgDHBzWWWpZlhWBssLDTDsQTLLtswswL", "gPhBHpjwHcljpggwwWqvbFvdCVRqPPnnqVRb", "zRRRRNqzpQZNNRRmRcZscQcCDmCTTTDGfTbfGhrTCTrbFF", "HMvMtjgtLHVlLVfhCGfrfhJhhrvh", "LBgStjnHBjLVgggBgHndnSNNQdNWcQQNGZccwsccdQpw", "jLRqmZNGtZtvZvHzPfCvSSzhCP", "QbwDVHFrVbDVrDFbzPwSThSfddhWPWzS", "rpnFDccHFHtZNmMmRntj", "RFVdzzlNtrwSTltb", "hHGcqqBcGLQZffHhMwSswSWGrnnbMStC", "cgqLBgQgpgbbPbPz", "lfcgglhfTvmlBvclbgztnSRtSmttwRJwptWR", "FMjDjsdNDjNMQLFFLCMQdtwGGzRwzpGwzdWzzJpGhn", "ZQVNsVZMPsVhCQsFCFsHHlqlcBZrHHfBflbHBB", "vGGQQdwNCTJfQJHJbM", "FFqmzghlzhgqjlFqzZhmhPlRgBDLLRTTcHMbRcJHBLcgRH", "qFrPjnhZmqnhZZjhhmpPzZmtvbpwtdvsSCCsGwdNwvwNCp", "nrFdSHScdRwvdvRm", "NNpPLJJbNbppCvmzbHTbmsTw", "fWLHPlPtpMNBgGQgqggQSMGc", "BcHtrBcnjflfHslsrnltbTgvMwpWnnWpwwwCwCCRRW", "dzGhLSSGDdPNgLLdPWTqWWRMqwRWpvzMMv", "VPZZNhhNSSDhLNSLdFZBVgBbjHcgsgfrbBJbfs", "VMnWjjWTnNNCzzhblbbjlj", "FmHwfFHqpDrJzPQLPLbCDs", "GrdFfHqqSmmwHSqHfpdMNTtTtZCMMZtTRggGZR", "QRlnlTphqNfqdjZNmd", "rDtPmGctFrcgDjJcNjvNJNCcNw", "bgGDtgDbBWBSBVlblmVmsRMmLM", "CcQTQTrrmfQQhZZBpZpSSZ", "JFqSvLlLbWggDvDDFHjsdnshBZpjHBBhBW", "FgJqNvLRMlMMDDblrtfrTCStmCVtNttz", "MRRbbddqtHbMZbqMHHTFTFgwZglWPfgsZWgW", "LCcLjzCNGNcvpvLTFPmzlFsfTgFlgs", "NhNGcrCGrsrvcDpvVcSbtHQJQbnQbSdHMtJV", "bfMfBFcWFsWZHBWRPQpRqdwmMpmddm", "rSShvvVTNVhvVCCvThDlSvCwpGCmRmGQmPwmpLRLRdpq", "DhRzzVNVVgSzTFcgtnbHnHbfBB", "HsTGHHvlvvGTGlHBvlbZstrVrwNjrjVStwVVZR", "PPmgcFJPFcFWmWMgdNtVtQZtDVDVdZZjjR", "LLqWnMnmNvlBLCTzCT", "qTttLqLvGCQqCDlhml", "FJjzrRBrpjRWrCwrBrrwpRbbDzgghSmmNhPQhgNshmDSzSNm", "bJBrbFRjBVnWBrRBnHLfHGfdVtvHttcCdT", "mTzjGPmPPmPNjNBTvlJRlNJzZqrzrSZZSpcZqpgcgcggFr", "QWCwwMwWWhVZFbpQDSpSJS", "stMMsWwMwVWtwJTNNPvvRmTsNPsl", "gGFFNWMMNFTBlLpGpSll", "qvccssdDwDbhMhzwHLppTSHLrdBpBVLV", "PhJhzhMJzwDJwhZZtZQJCjgWtFjZ", "pGqWfqqGcspGqWqppHprpTrzhCzttMBCtbtJmtJbSBvWBt", "QDnVPgVPgDCJBMhmBJgv", "NlZwFlnnPLLlFwDlDlnPPFFHTMTdMZjTTcjsqqcsdfGdcp", "HLzZfHWWQwpgVHjVHr", "JlMlMGGDMtJGdtJhqtlccDgVCSTFFSCSDTggpvFTjSgS", "JcGRMlthtlVNMJRfzWsPnQsnnZNZns", "zVfvMpsbtQmtBlFWBZ", "lLSrlNTNRSFRFhhHRmPR", "dnSJjjwJJGwwnzVlvpszvccM", "SmlcCrpnrnznGzSBBSfzNbtsQsWZQcFbWctcbbZb", "JHgwJPjvdghbbWdDZGNLZb", "JjghvvhRwhwJVhHTzmfRfzGSMrzBfnGC", "JbCmrbnzmntnVJjbCHJJFQFvqgJgQgqLDQ", "NGhhhhPMGhWsSSchWlNsCLBBlLFQCgqvgCFFgQBg", "PdcNWWcdGdPssPPNTSNNtzbTwjntzbbVwtZpCVnb", "tGNgtsNQHsJmwwzddmQw", "hMhhDBwMhDDfCRRBjFDDTTWjdWmrmdWqjlmmmjJz", "RSpSSBhppDhRncRLswZLGvtGvNcNtL"};



    public static void main(String[] args){
        int priorityScore = 0;
        int index = 0;
        for (int i = 0; i < 100 ; i++){
            String[] list = new String[]{input[index], input[index + 1], input[index+2]};
            List<Character> firstList = list[0].chars()
                    .mapToObj(p -> (char) p)
                    .collect(Collectors.toList());

            List<Character> secondList = list[1].chars()
                    .mapToObj(p -> (char) p)
                    .collect(Collectors.toList());

            List<Character> thirdList = list[2].chars()
                    .mapToObj(p -> (char) p)
                    .collect(Collectors.toList());

            // check first list
            boolean scoreIncremented = false;
            for (char c : firstList) {
                if (secondList.contains(c) && thirdList.contains(c)){
                    priorityScore += priority.indexOf(c) + 1;
                    scoreIncremented = true;
                }
                if (scoreIncremented) break;
            }
            index +=3;

        }
        println(String.valueOf(priorityScore));


    }

    public static void problem1(){
        int priorityScore = 0;
        int count = 0;

        for (String i: input) {
            count ++;
            int middleOfList = i.length() / 2;
            String[] compartments = {i.substring(0, middleOfList),i.substring(middleOfList)};
            char[] compartment1 = compartments[0].toCharArray();
            char[] compartment2 = compartments[1].toCharArray();

            ArrayList<Character> compartment2List = new ArrayList<>();
            for (char item: compartment2) {
                compartment2List.add(item);
            }
            boolean scoreUpdated = false;
            for (char item: compartment1) {
                if (scoreUpdated){
                    break;
                }
                for (Character character : compartment2List) {
                    if (character == item && !scoreUpdated){
                        priorityScore += priority.indexOf(item) + 1;
                        scoreUpdated = true;
                    }
                }
            }
        }

        println(String.valueOf(priorityScore));
        println(String.valueOf(count));
    }
}
