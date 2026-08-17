
```drawio-resource
../governance.drawio
```

# Nasdanika Governance Models

Two [Ecore](https://ecore.models.nasdanika.org/) micro-models of the governance domain:

* Governance (this model): framework-neutral base. Frameworks and requirements, policies, controls, risks, control applications, evidence, assessments, findings, waivers.
* [AI Governance](https://ai.governance.models.nasdanika.org): AI extension. AI systems with EU AI Act risk tiers, model and dataset assets, an AI risk taxonomy, impact assessments, human oversight modes, AI-typed evidence (model cards, evaluations, telemetry), incidents.

The split follows the pattern the standards world itself uses: ISO/IEC 42001 is the generic Annex SL management-system skeleton plus AI-specific controls; NIST AI RMF is enterprise risk management specialized to AI; OSCAL is domain-neutral with frameworks as data.
The base stays micro and reusable; the extension carries the vocabulary that would otherwise pollute it.

## Why a model?

Governance today lives in spreadsheets, questionnaires, and SaaS platforms with proprietary data models.
A typed model is a single machine-readable source that can say things none of them can:

* **Crosswalks as references.** One control satisfies requirements in several frameworks (AI RMF, 42001 Annex A, AI Act articles). That is a many-to-many reference in a model and a hand-maintained matrix in a spreadsheet.
* **Compliance status as structure.** [ControlApplication](references/eClassifiers/ControlApplication/index.html) is the unit of status: control X on system Y is `VERIFIED`, with [evidence](references/eClassifiers/Evidence/index.html) attached. Audit packs, gap reports, and per-framework views are generated, not compiled by hand.
* **Evidence from telemetry.** `TelemetryEvidence` points at modeled telemetry (telemetry as code), so continuous control monitoring is a query reference rather than a platform feature.
* **Honest records.** Waivers, findings, and `NOT_ASSESSED` defaults keep the model truthful about the gap between policy and practice.

## Governance as an aspect

The governance model is an aspect model, like the [lifecycle](https://lifecycle.models.nasdanika.org/) and [role](https://role.models.nasdanika.org/) models: the lifecycle model applies to anything with a lifecycle, the role model to anything operated on, and the governance model to anything which needs governance.
[`Governed`](references/eClassifiers/Governed/index.html) is the extension point.
An agent, a tool, or an MCP server from the [agent model](https://agent.models.nasdanika.org/index.html), or a capability provider in the [capability model](https://capability.models.nasdanika.org/), extends it and immediately carries risks, applied controls, and waivers.

That makes capability selection risk-informed: a hand-rolled agentic loop and a full framework are both capability providers, but they have different risk profiles and different control obligations, and the model can show the difference.

Frameworks themselves are instance data, not metamodel classes.
NIST AI RMF functions, ISO/IEC 42001 Annex A controls, and EU AI Act articles load as [Framework](references/eClassifiers/Framework/index.html) / [Requirement](references/eClassifiers/Requirement/index.html) catalogs; adding a framework is authoring, not metamodel change.

## Uses

**Learning and certification.** The AI model's vocabulary tracks the IAPP AIGP Body of Knowledge (v2.1) and its underlying sources: NIST AI RMF, ISO/IEC 42001 and 23894, the EU AI Act.
Building and instantiating the model is a way to learn the domain structurally, and the generated documentation doubles as study material.

**Documentation generation.** Model a governance program and generate its documentation site: control catalogs, risk registers with inherent and residual heat maps, per-framework compliance views, per-system audit packs.

**Composition with other Nasdanika models.** The agent, [MCP](https://mcp.models.nasdanika.org/), and [Product Management](https://product-management.models.nasdanika.org/) models gain a governance aspect by extending `Governed`.
The AI Risk Manager persona consumes what the AI Architect persona produces: control status, evidence, incident records.

**Export.** The model can emit OSCAL-shaped artifacts, CycloneDX ML-BOM / model card documents, and EU AI Act Annex IV style technical documentation as generated views rather than hand-written files.

## Model overview

### Governance (base)

| Area | Types |
|------|-------|
| Program | [GovernanceProgram](references/eClassifiers/GovernanceProgram/index.html) |
| Frameworks | [Framework](references/eClassifiers/Framework/index.html), [Requirement](references/eClassifiers/Requirement/index.html) (hierarchical) |
| Policies | [Policy](references/eClassifiers/Policy/index.html) |
| Controls | [Control]](references/eClassifiers/Contro/index.html), [ControlNature](references/eClassifiers/ControlNature/index.html), [ControlAutomation](references/eClassifiers/ControlAutomation/index.html) |
| Risks | [Risk](references/eClassifiers/Risk/index.html), [RiskTreatment](references/eClassifiers/RiskTreatment/index.html) |
| Governed elements | [Governed](references/eClassifiers/Governed/index.html), [ControlApplication](references/eClassifiers/ControlApplication/index.html), [ImplementationStatus](references/eClassifiers/ImplementationStatus/index.html) |
| Evidence | [Evidence](references/eClassifiers/Evidence/index.html) |
| Assessment | [Assessment](references/eClassifiers/Assessment/index.html), [Finding](references/eClassifiers/Finding/index.html), [FindingStatus](references/eClassifiers/FindingStatus/index.html), [Waiver](references/eClassifiers/Waiver/index.html) |

### AI Governance (extension)

| Area | Types |
|------|-------|
| Systems | `AISystem`, `AiActRiskTier`, `AiActActorRole`, `ModelAsset`, `DatasetAsset` |
| Risks | `AIRisk`, `AiRiskCategory` |
| Impact assessments | `ImpactAssessment`, `ImpactAssessmentKind` |
| Oversight | `HumanOversightControl`, `OversightMode` |
| Evidence | `ModelCard`, `Evaluation`, `EvaluationKind`, `TelemetryEvidence` |
| Incidents | `Incident`, `IncidentStatus` |
