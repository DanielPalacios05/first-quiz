## Security Analysis for the Proposed Company

### 1. Cryptographic Failures

The specification does not state whether the database is encrypted. This is crucial, as we are treating sensitive data (user credentials, home addresses, customer orders). A data encryption strategy must be defined to protect data from being easily retrieved by attackers.

The first step is to define the encryption strategy based on regulations and business needs. Stable cryptographic methods must be defined for this data to ensure its protection throughout its entire lifecycle.

### 2. Broken Access Control

Currently, 12 software engineers have full control over the system, and 3 customer support employees and 1 sales employee can view customer information and make changes to orders and accounts.

The more uncontrolled access we give to the system, the more prone we are to unintended disclosure, modification, or even destruction of our information and system. Our entire business is put at a high risk that can quickly turn into a disaster.

To solve this problem, it is imperative to define clear policies that define:

 1. Roles and which parts of the system these roles can access/modify
 2.Which roles the different system stakeholders have
 3.The channels where different roles can interact with the system
 4.These policies should be reflected in the system's design.

As a result of these policies, employees and customers will have access to the system restricted to the parts they need to successfully complete their tasks, thereby reducing the risk of breaking the system.

### 3. DevSecOps

As the startup grows in complexity and clients, we become less tolerant to risk. Security must progressively become a priority in our entire development lifecycle. Guidelines should be defined so that security concerns are consistently assessed and addressed as applications are created, deployed, and updated.

This approach to software development helps to correct insecure designs with vulnerable and outdated components as quickly as possible and deal with software exploits like code injection and server-side request forgery in a precise way.